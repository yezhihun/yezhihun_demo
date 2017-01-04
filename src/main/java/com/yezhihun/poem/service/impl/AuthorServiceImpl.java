package com.yezhihun.poem.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yezhihun.poem.dao.AuthorDao;
import com.yezhihun.poem.entity.Author;
import com.yezhihun.poem.service.AuthorService;

@Service
public class AuthorServiceImpl extends AbstractBaseServiceImpl<Author> implements AuthorService{

	@Autowired
	private AuthorDao authorDao;
	
	@PostConstruct
	@Override
	public void init() {
		this.baseDao = authorDao;
	}

	@Override
	public Author saveOrUpdateByName(Author author) {
		Author old = authorDao.getByName(author.getName());
		if(old==null){
			old = authorDao.save(author);
		}
		return old;
	}

}
