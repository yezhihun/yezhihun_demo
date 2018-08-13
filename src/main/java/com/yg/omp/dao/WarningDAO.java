package com.yg.omp.dao;

import com.yg.omp.base.BaseDao;
import com.yg.omp.base.PageModel;
import com.yg.omp.model.Warning;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
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
//    @Modifying
    @Query(value = "select t from Warning t", nativeQuery = false)
    List<Warning> selectABC();
//    long countById(Integer id);
    @Query(value = "SELECT count(w) from Warning w where w.buildingName=?1 and w.warningType=?2" +
                        " and w.createTime >= ?3 and w.createTime <= ?4 order by w.createTime desc ")
    long countByBuildingNameAndWarningTypeAndCreateTimeBetweenOrderByCreateTime(String buildingName, String warningType, Date createTimeStart, Date createTime);


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