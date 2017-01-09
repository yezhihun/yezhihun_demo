package com.yezhihun.poem.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yezhihun.poem.dao.ArticleDao;
import com.yezhihun.poem.entity.Article;
import com.yezhihun.poem.entity.Author;
import com.yezhihun.poem.service.ArticleService;
import com.yezhihun.poem.service.AuthorService;

@Service
public class ArticleServiceImpl extends AbstractBaseServiceImpl<Article> implements ArticleService{

	@Autowired
	private ArticleDao articleDao;
	
	@Autowired
	private AuthorService authorService;
	
	@PostConstruct
	@Override
	public void init() {
		this.baseDao = articleDao;
	}

	@Transactional
	@Override
	public void createArticle() throws Exception{
		String result = readFile();
		List<Map<String,Object>> list = convert(result);
		for(Map<String,Object> map : list){
			Article article = (Article)map.get("article");
			Author author = (Author)map.get("author");
			
			author = authorService.saveOrUpdateByName(author);
			article.setAuthorId(author.getId());
			saveOrUpdate(article);
		}
		
	}

	private  String  readFile() throws Exception {
		File file = new File("D://poem2.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GBK"));
		
		StringBuilder sb = new StringBuilder();
		String tempLine = null;
		while ((tempLine = br.readLine()) != null) {
			if(!StringUtils.isBlank(tempLine)){
				sb.append("\r\n"+tempLine);
//				sb.append(tempLine);
			}
		}
		
//		System.out.println(sb.toString());
		
		br.close();
		
		return sb.toString();
	}
	
	private  List<Map<String,Object>> convert(String str){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		String [] s1 = str.split("《");
		for(String content : s1){
			if(StringUtils.isBlank(content)){
				continue;
			}
			content = content.trim();
			String title = content.substring(0, content.indexOf("》")).trim();
			content = content.substring(content.indexOf("》")+1).trim();
			System.out.println("     "+title);
			String aut1 = "作者：";
			String aut2 = "作者";
			String aut = "";
			if(content.indexOf(aut1)!=-1){
				aut = aut1;
			}else if(content.indexOf(aut2)!=-1){
				aut = aut2;
			}
			String author = content.substring(content.indexOf(aut)+aut.length(),content.indexOf("\r\n")).replace("(", "").replace(")", "").replace("（", "").replace("）", "").trim();
			System.out.println("   作者："+author);
			String con = content.substring(content.indexOf(author)+author.length()+1).trim().replace("\r\n", " ");
			System.out.println(con);
			
			Article article = new Article();
			article.setContent(con);
			article.setTitle(title);
			
			Author a = new Author();
			a.setName(author);
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("article", article);
			map.put("author", a);
			
			list.add(map);
		}
		return list;
	}

	@Override
	public void saveOrUpdate(Article article) {
		Article old = articleDao.getByTitle(article.getTitle().trim());
		if(old == null){
			articleDao.save(article);
		}
		
	}

	@Override
	public List<Map<String, Object>> findAllArticle() {
		return articleDao.findAllArticle();
	}
}
