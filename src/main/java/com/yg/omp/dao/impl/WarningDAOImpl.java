package com.yg.omp.dao.impl;

import com.yg.omp.base.BaseDaoImpl;
import com.yg.omp.base.PageModel;
import com.yg.omp.model.Warning;

import javax.persistence.Query;
import java.util.List;

/**
 * @author 
 */
@SuppressWarnings("unused")
public class WarningDAOImpl extends BaseDaoImpl<Warning> {

    List<Warning> findByParamPage(String buildingName, String warningType, String createTimeStart, String createTimeEnd, PageModel page){
        StringBuilder hql = new StringBuilder("SELECT w FROM Warning w WHERE 1=1 AND warning_status IN (0,1)");
        if (buildingName != null && !buildingName.equals("")){
            hql.append(" AND buildingName IN " + splitForIn(buildingName));
        }
        if (warningType != null && !warningType.equals("")){
            hql.append(" AND warningType = " + splitForIn(warningType));
        }
        if (createTimeStart != null){
            hql.append(" AND createTime >= " + createTimeStart);
        }
        if (createTimeEnd != null){
            hql.append(" AND createTime <= " + createTimeEnd);
        }
        hql.append(" ORDER BY createTime desc, id DESC ");

        Query q = entityManager.createQuery(hql.toString(), Warning.class);
        q.setFirstResult(page.getStartIndex());
        q.setMaxResults(page.getPageSize());

        List<Warning> result = q.getResultList();
        return result;
    }

    private String splitForIn(String str){
        String result = "(\"'" + str.replaceAll(",", "','") + "'\")";
        return result;
    }
}