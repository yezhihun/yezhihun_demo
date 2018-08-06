package com.yg.omp.service;

import java.util.List;

/**
 * 
 * 
 *
 * Description: 服务层基础接口
 *
 * @author tianye
 * @version V1.0
 * <pre>
 * Modification History: 
 * Date         Author      Version     Description 
 * ------------------------------------------------------------------ 
 * 2016年8月29日下午3:07:04    Administrator       V1.0        
 * </pre>
 */
public interface BaseService<T> {

	void deleteByPrimaryKey(Integer id);

    void insert(T t);

    T selectByPrimaryKey(Integer id);

    //TODO update 实现 待定
//    int updateByPrimaryKeySelective(T t);

//    int updateByPrimaryKey(T t);
    
    void init();
    
    List<T> findAll();
    
    void batchInsert(List<T> list);
}
