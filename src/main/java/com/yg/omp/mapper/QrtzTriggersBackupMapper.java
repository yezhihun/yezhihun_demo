package com.yg.omp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yg.omp.entity.QrtzTriggersBackup;
import com.yg.omp.model.QrtzTriggersBackupExample;

public interface QrtzTriggersBackupMapper {
	public int countByExample(QrtzTriggersBackupExample example);

	public int deleteByExample(QrtzTriggersBackupExample example);

	public int deleteByPrimaryKey(QrtzTriggersBackup key);

	public int insert(QrtzTriggersBackup record);

	public int insertSelective(QrtzTriggersBackup record);

	public List<QrtzTriggersBackup> selectByExample(QrtzTriggersBackupExample example);

	public QrtzTriggersBackup selectByPrimaryKey(QrtzTriggersBackup key);

	public int updateByExampleSelective(@Param("record") QrtzTriggersBackup record, @Param("example") QrtzTriggersBackupExample example);

	public int updateByExample(@Param("record") QrtzTriggersBackup record, @Param("example") QrtzTriggersBackupExample example);

	public int updateByPrimaryKeySelective(QrtzTriggersBackup record);

	public int updateByPrimaryKey(QrtzTriggersBackup record);
    
	/**
	 * 
	* @Author tianye
	* @Description: 查询分页数据 
	* @return List<QrtzTriggersBackup>
	* @throws
	 */
	public List<QrtzTriggersBackup> selectListByPage(QrtzTriggersBackupExample example);
	
	/**
	 * 
	* @Author tianye
	* @Description: 查询数据总量 
	* @return List<QrtzTriggersBackup>
	* @throws
	 */
	public int selectCountPage(QrtzTriggersBackupExample example);

	/**
	 * 
	* @Author tianye
	* @Description: 插入备份定时任务
	* @throws
	 */
	public void insertBackupData(String jobName);

	/**
	 * 
	* @Author tianye
	* @Description: 删除备份定时任务
	* @throws
	 */
	public void deleteByJobName(String jobName);
}