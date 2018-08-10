package com.yg.omp.dao;

import com.yg.omp.base.BaseDao;
import com.yg.omp.base.PageModel;
import com.yg.omp.model.Warning;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 */
@Repository
public interface WarningDAO extends BaseDao<Warning> {

    /**
     *
     * @param buildingName
     * @param warningType
     * @param createTimeStart
     * @param createTime
     * @return
     */
    @Modifying
    @Query("select t from Warning t")
    long countById(Integer id);
//    @Query(countQuery = "")
//    long countByBuildingNameAndWarningTypeAndCreateTimeBetweenOrderByCreateTime(String buildingName, String warningType, String createTimeStart, String createTime);


    /**
     *
     * @param buildingName
     * @param warningType
     * @param createTimeStart
     * @param createTimeEnd
     * @param page
     * @return
     */
    List<Warning> findByParamPage(String buildingName, String warningType, String createTimeStart, String createTimeEnd, PageModel page);
}