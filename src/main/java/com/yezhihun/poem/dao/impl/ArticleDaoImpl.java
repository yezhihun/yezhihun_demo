package com.yezhihun.poem.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;

import com.yezhihun.poem.base.BaseDaoImpl;
import com.yezhihun.poem.entity.Article;

public class ArticleDaoImpl extends BaseDaoImpl<Article>{

	@SuppressWarnings("unchecked")
	public List<Map<String,Object>> findAllArticle(){
		Query q = entityManager.createNativeQuery("SELECT a.title,a.content,au.`name` author FROM article a LEFT JOIN author au ON a.author_id = au.id");
		q.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);  
		List<Map<String,Object>> list = (List<Map<String,Object>>)q.getResultList();
		
		return list;
	}
}
