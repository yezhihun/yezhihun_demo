package com.yezhihun.poem.dao;

import org.springframework.stereotype.Repository;

import com.yezhihun.poem.base.BaseDao;
import com.yezhihun.poem.entity.Author;

@Repository
public interface AuthorDao extends BaseDao<Author>{

	public Author getByName(String name);
}
