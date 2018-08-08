package com.yg.omp.controller;

import com.yg.omp.base.PageModel;
import com.yg.omp.service.WarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tianye on 2018/8/8.
 */
@Controller
@RequestMapping("/warning")
public class WarningController {

    @Autowired
    private WarningService warningService;


    @RequestMapping("/queryWarningLog")
    @ResponseBody
    public PageModel queryWarningLog(@RequestParam("buildingName") String buildingName, @RequestParam("startTime") String startTime
                                        , @RequestParam("endTime") String endTime, @RequestParam("warningType") String warningType
                                        , @RequestParam("pageSize") Integer pageSize, @RequestParam("pageNo") Integer pageNo) {
//        Date startDate = null;
//        Date endDate = null;
//        if (startTime!=null){
//            startDate = DateUtil.formatting(startTime, DateUtil.FORMATTING_DATETIME);
//            endDate = DateUtil.formatting(endTime, DateUtil.FORMATTING_DATETIME);
//        }
        PageModel page = new PageModel();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);

        page = warningService.selectWarningForParam(buildingName, startTime, endTime, warningType, page);

        return page;
    }
}
