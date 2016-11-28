package com.yg.omp.mapper;

import com.yg.omp.entity.OmLog;
import com.yg.omp.model.OmLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmLogMapper {
	public int countByExample(OmLogExample example);

	public int deleteByExample(OmLogExample example);

	public int deleteByPrimaryKey(Integer id);

	public int insert(OmLog record);

	public int insertSelective(OmLog record);

	public List<OmLog> selectByExampleWithBLOBs(OmLogExample example);

	public List<OmLog> selectByExample(OmLogExample example);

	public OmLog selectByPrimaryKey(Integer id);

	public int updateByExampleSelective(@Param("record") OmLog record, @Param("example") OmLogExample example);

	public int updateByExampleWithBLOBs(@Param("record") OmLog record, @Param("example") OmLogExample example);

	public int updateByExample(@Param("record") OmLog record, @Param("example") OmLogExample example);

	public int updateByPrimaryKeySelective(OmLog record);

	public int updateByPrimaryKeyWithBLOBs(OmLog record);

	public int updateByPrimaryKey(OmLog record);
}