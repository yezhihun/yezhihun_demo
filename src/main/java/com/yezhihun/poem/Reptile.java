package com.yezhihun.poem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import com.yezhihun.poem.entity.Article;
import com.yezhihun.poem.entity.Author;

public class Reptile {

	public static void main(String[] args) throws Exception {
		String result = readFile();
		
		List<Map<String,Object>> list = convert(result);
		FileUtils.readLines(new File(""));
	}
	
	private static String  readFile() throws Exception {
		File file = new File("D://poem.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GBK"));
		
		StringBuilder sb = new StringBuilder();
		String tempLine = null;
		while ((tempLine = br.readLine()) != null) {
			if(!StringUtils.isBlank(tempLine)){
				sb.append("\r\n"+tempLine);
			}
		}
		
//		System.out.println(sb.toString());
		
		br.close();
		
		return sb.toString();
	}
	
	private static List<Map<String,Object>> convert(String str){
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
			//TODO test
			String author = content.substring(content.indexOf(aut)+aut.length(),content.indexOf("\r\n")).replace("(", "").replace(")", "").replace("（", "").replace("）", "").trim();
			System.out.println("   作者："+author);
			String con = content.substring(content.indexOf(author)+author.length()+1).trim();
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

	public void convert(){
		int[] arry = {50,20,10,5,2,1};

		for(int i=0;i<arry.length-1;i++){
			int sum = arry[i];
			String s = "";
			for(int j=i+1;j<arry.length-1;j++){
				int next = arry[j];
				if(sum==next){
					s += (next+" ");
					break;
				}
				if(sum/2>next){

				}
			}


		}
	}
}
