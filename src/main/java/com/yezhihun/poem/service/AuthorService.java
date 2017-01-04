package com.yezhihun.poem.service;

import com.yezhihun.poem.entity.Author;

/**
 * 
 * 
 *
 * Description: 作者
 *
 * @author tianye
 * @version V1.0
 * <pre>
 * Modification History: 
 * Date         Author      Version     Description 
 * ------------------------------------------------------------------ 
 * 2017年1月4日下午4:19:03    Administrator       V1.0        
 * </pre>
 */
public interface AuthorService extends BaseService<Author>{
	
	public Author saveOrUpdateByName(Author author);
}
