package com.yg.omp.mapper;

import com.yg.omp.entity.DeductWater;
import com.yg.omp.model.DeductWaterExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DeductWaterMapper {
	public int countByExample(DeductWaterExample example);

	public int deleteByExample(DeductWaterExample example);

	public int deleteByPrimaryKey(Integer id);

	public int insert(DeductWater record);

	public int insertSelective(DeductWater record);

	public List<DeductWater> selectByExample(DeductWaterExample example);

	public DeductWater selectByPrimaryKey(Integer id);

	public int updateByExampleSelective(@Param("record") DeductWater record, @Param("example") DeductWaterExample example);

	public int updateByExample(@Param("record") DeductWater record, @Param("example") DeductWaterExample example);

	public int updateByPrimaryKeySelective(DeductWater record);

	public int updateByPrimaryKey(DeductWater record);
}