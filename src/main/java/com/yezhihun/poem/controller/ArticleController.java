package com.yezhihun.poem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.yezhihun.poem.entity.Article;
import com.yezhihun.poem.service.ArticleService;
import com.yezhihun.poem.service.AuthorService;

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
	
	@RequestMapping(value="/showArticleList")
	public String showArticleList(HttpServletRequest request){
		List<Article> list = articleService.findAll();
		String json = JSONObject.toJSONString(list);
		return json;
	}
}
