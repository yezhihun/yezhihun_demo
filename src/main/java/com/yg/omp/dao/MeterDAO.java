package com.yg.omp.dao;

import com.yg.omp.base.BaseDao;
import com.yg.omp.model.Meter;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 
 */
@Repository
public interface MeterDAO extends BaseDao<Meter>{

    List<Meter> findByCabinetId(Integer cabinetId);
}