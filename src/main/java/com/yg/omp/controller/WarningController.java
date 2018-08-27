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
    public PageModel queryWarningLog(@RequestParam(value = "buildingName", required = false) String buildingName, @RequestParam(value = "startTime", required = false) String startTime
                                        , @RequestParam(value = "endTime", required = false) String endTime, @RequestParam(value = "warningType", required = false) String warningType
                                        , @RequestParam(value = "pageSize", required = false) Integer pageSize, @RequestParam(value = "pageNo", required = false) Integer pageNo) {
//        Date startDate = null;
//        Date endDate = null;
//        if (startTime!=null){
//            startDate = DateUtil.formatting(startTime, DateUtil.FORMATTING_DATETIME);
//            endDate = DateUtil.formatting(endTime, DateUtil.FORMATTING_DATETIME);
//        }
        PageModel page = new PageModel();
        page.setPageNo(pageNo == null ? 1 : pageNo);
        page.setPageSize(pageSize == null ? 10 : pageSize);

        page = warningService.selectWarningForParam(buildingName, startTime, endTime, warningType, page);

        return page;
    }
}
