package com.yg.omp.dao;

import com.yg.omp.base.BaseDao;
import com.yg.omp.base.PageModel;
import com.yg.omp.model.Warning;
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
    Long countByBuildingNameAndWarningTypeAndCreateTimeBetweenOrderByCreateTime(String buildingName, String warningType, String createTimeStart, String createTime);

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