package com.yg.omp.service.impl;

import com.yg.omp.base.PageModel;
import com.yg.omp.dao.WarningDAO;
import com.yg.omp.model.Warning;
import com.yg.omp.service.WarningService;
import com.yg.omp.utils.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarningServiceImpl extends AbstractBaseServiceImpl<Warning> implements WarningService {
    @Autowired
    private WarningDAO warningDAO;

    private static final Logger logger = LoggerFactory.getLogger(WarningServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = warningDAO;
    }

    @Override
    public PageModel selectWarningForParam(String buildingName, String startTime, String endTime, String warningType, PageModel page) {
        if (buildingName != null && buildingName.endsWith(",")){
            buildingName = buildingName.substring(0, buildingName.length()-1);
        }
        if (warningType != null && warningType.endsWith(",")){
            warningType = warningType.substring(0, warningType.length()-1);
        }
        List<Warning> list = warningDAO.findByParamPage(buildingName, warningType, startTime, endTime, page);
        Long count = warningDAO.countByBuildingNameAndWarningTypeAndCreateTimeBetweenOrderByCreateTime(buildingName, warningType, DateUtil.formatting(startTime, DateUtil.FORMATTING_DATE), DateUtil.formatting(endTime, DateUtil.FORMATTING_DATE));

        page.setRows(list);
        page.setTotal(count);
        return page;
    }

    @Override
    public List<Warning> selectAll() {
//        warningDAO.countByBuildingName("");/
        return warningDAO.selectABC();
//        return null;
    }
}