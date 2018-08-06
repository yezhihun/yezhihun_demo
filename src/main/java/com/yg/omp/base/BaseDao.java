package com.yg.omp.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseDao<T> extends JpaRepository<T, Integer> {

	void update(T t);

	void update(T oldObj, T newObj);

	/**
	 *
	* @Author tianye
	* @Description: 批量插入
	* @return void
	* @throws
	 */
	void batchSave(List<T> t);

	/**
	 *
	* @Author tianye
	* @Description:批量更新
	* @return void
	* @throws
	 */
	void batchUpdate(List<T> t);

	/**
	 *
	* @Author tianye
	* @Description: 批量操作 插入或者更新
	* @return void
	* @throws
	 */
	void batchSaveOrUpdate(List<T> t);
}
