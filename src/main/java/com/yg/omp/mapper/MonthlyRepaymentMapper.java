package com.yg.omp.mapper;

import com.yg.omp.entity.MonthlyRepayment;
import com.yg.omp.model.MonthlyRepaymentExample;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MonthlyRepaymentMapper {
    
	/**
	 * 
	* @Author tianye
	* @Description: 更新状态 
	* @return void
	* @throws
	 */
	public void updateStatusByPrimaryKey(MonthlyRepayment record);
    
	/**
	 * 
	* @Author tianye
	* @Description: 根据globalId查询
	* @return MonthlyRepayment
	* @throws
	 */
	public MonthlyRepayment selectByGlobalId(String globalId);
    
	/**
	 * 
	* @Author tianye
	* @Description: 根据运营系统ID查询
	* @return MonthlyRepayment
	* @throws
	 */
	public MonthlyRepayment selectByReId(String reId);
    
	/**
	 * 
	* @Author tianye
	* @Description: 根据运营系统ID查询
	* @return List<MonthlyRepayment>
	* @throws
	 */
	public List<MonthlyRepayment> selectByReIds(List<String> param);
    
	/**
	 * 
	* @Author tianye
	* @Description: 查询导出数据
	* @return List<MonthlyRepayment>
	* @throws
	 */
	public List<MonthlyRepayment> selectExportByStatus(MonthlyRepayment record);
    
	/**
	 * 
	* @Author tianye
	* @Description: 查询总金额
	* @return MonthlyRepayment
	* @throws
	 */
	public BigDecimal selectTotalMoney(MonthlyRepayment record);
	
	/**
	 * 
	* @Author tianye
	* @Description: 查询分页数据
	* @return List<MonthlyRepayment>
	* @throws
	 */
	public List<MonthlyRepayment> selectByExample(MonthlyRepaymentExample example);
	
	/**
	 * 
	* @Author tianye
	* @Description: 查询数据总数
	* @return int
	* @throws
	 */
	public int countByExample(MonthlyRepaymentExample example);

	/**
	 * 
	* @Author tianye
	* @Description: 删除数据
	* @return int
	* @throws
	 */
	public int deleteByExample(MonthlyRepaymentExample example);

	/**
	 * 
	* @Author tianye
	* @Description: 根据主键删除数据
	* @return int
	* @throws
	 */
	public int deleteByPrimaryKey(Integer id);

	/**
	 * 
	* @Author tianye
	* @Description: 插入数据
	* @return int
	* @throws
	 */
	public int insert(MonthlyRepayment record);

	/**
	 * 
	* @Author tianye
	* @Description: 插入不为null的字段数据
	* @return int
	* @throws
	 */
	public int insertSelective(MonthlyRepayment record);

	/**
	 * 
	* @Author tianye
	* @Description: 根据主键查询数据
	* @return MonthlyRepayment
	* @throws
	 */
	public MonthlyRepayment selectByPrimaryKey(Integer id);

	/**
	 * 
	* @Author tianye
	* @Description: 选择一种示范案例进行更新
	* @return int
	* @throws
	 */
	public int updateByExampleSelective(@Param("record") MonthlyRepayment record, @Param("example") MonthlyRepaymentExample example);

	/**
	 * 
	* @Author tianye
	* @Description: 示范案例进行更新
	* @return int
	* @throws
	 */
	public int updateByExample(@Param("record") MonthlyRepayment record, @Param("example") MonthlyRepaymentExample example);

	/**
	 * 
	* @Author tianye
	* @Description: 按主键更新值不为null的字段
	* @return int
	* @throws
	 */
	public int updateByPrimaryKeySelective(MonthlyRepayment record);

	/**
	 * 
	* @Author tianye
	* @Description: 按主键更新
	* @return int
	* @throws
	 */
	public int updateByPrimaryKey(MonthlyRepayment record);
}