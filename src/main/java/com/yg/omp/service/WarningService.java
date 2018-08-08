package com.yg.omp.service;

import com.yg.omp.base.PageModel;
import com.yg.omp.model.Warning;

public interface WarningService extends BaseService<Warning> {

    PageModel selectWarningForParam(String buildingName, String startTime, String endTime, String warningType, PageModel page);
}