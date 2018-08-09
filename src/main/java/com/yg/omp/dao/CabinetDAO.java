package com.yg.omp.dao;

import com.yg.omp.base.BaseDao;
import com.yg.omp.model.Cabinet;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 
 */
@Repository
public interface CabinetDAO  extends BaseDao<Cabinet> {

    List<Cabinet> findByBuildingId(Integer buildingId);
}