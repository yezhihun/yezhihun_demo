package com.yezhihun.poem.service;

import com.yezhihun.poem.entity.Article;

/**
 * 
 * 
 *
 * Description: 文章服务层
 *
 * @author tianye
 * @version V1.0
 * <pre>
 * Modification History: 
 * Date         Author      Version     Description 
 * ------------------------------------------------------------------ 
 * 2017年1月4日下午4:09:18    Administrator       V1.0        
 * </pre>
 */
public interface ArticleService extends BaseService<Article>{
	
	/**
	 * 
	* @Author Administrator
	* @Description: 生成文章
	* @return void
	* @throws
	 */
	public void createArticle() throws Exception;
	
	public void saveOrUpdate(Article article);
}
