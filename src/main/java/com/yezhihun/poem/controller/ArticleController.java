package com.yezhihun.poem.controller;

import com.alibaba.fastjson.JSONObject;
import com.yezhihun.poem.service.ArticleService;
import com.yezhihun.poem.service.AuthorService;
import org.apache.xpath.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/articleController")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	
	@Autowired
	private AuthorService authorService;
	
	
	@RequestMapping("/showArticlePage")
	public String showArticlePage(){
		
		return "app/article/articleList";
	}
	
	@ResponseBody
	@RequestMapping(value="/showArticleList")
	public JSONObject showArticleList(HttpServletRequest request){
		List<Map<String,Object>> list = articleService.findAllArticle();
		JSONObject json = new JSONObject();
		json.put("list", list);
		return json;
	}
}
