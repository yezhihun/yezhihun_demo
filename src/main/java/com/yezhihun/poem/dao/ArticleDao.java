package com.yezhihun.poem.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yezhihun.poem.base.BaseDao;
import com.yezhihun.poem.entity.Article;

@Repository
public interface ArticleDao extends BaseDao<Article>{

	public Article getByTitle(String title);
	
	public List<Map<String,Object>> findAllArticle();
}
