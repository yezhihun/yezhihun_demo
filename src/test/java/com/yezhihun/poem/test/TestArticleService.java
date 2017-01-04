package com.yezhihun.poem.test;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yezhihun.poem.service.ArticleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-application.xml"})
public class TestArticleService {

	@Autowired
	private ArticleService articleService;
	
	@Test
	@Transactional//标明此方法需使用事务
	@Rollback(false)//标明使用完此方法后事务不回滚,true时为回滚
	public void testCreateArtice(){
		try{
			articleService.createArticle();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

}
