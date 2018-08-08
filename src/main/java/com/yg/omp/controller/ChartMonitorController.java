package com.yg.omp.controller;

import com.alibaba.fastjson.JSONObject;
import com.yg.omp.service.impl.CurDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by tianye on 2018/8/8.
 * 一次图监测
 */
@Controller
@RequestMapping("/chartMonitor")
public class ChartMonitorController {

    @Autowired
    private CurDataServiceImpl curDataService;

    /**
     * 一次图检测-低压
     *
     * @param buildingId
     * @param transformerId
     * @return
     */
    @RequestMapping("/low")
    @ResponseBody
    public JSONObject chartMonitorForLow(@RequestParam("buildingId") Integer buildingId, @RequestParam("transformerId") Integer transformerId) {
        JSONObject jsonObject = new JSONObject();
        List<Map<String, Object>> list = curDataService.selectChartMonitorForLow(buildingId, transformerId);

        jsonObject.put("data", list);
        return jsonObject;
    }

    /**
     * 一次图检测-高压
     *
     * @param buildingId
     * @param transformerId （为空）
     * @return
     */
    @RequestMapping("/high")
    @ResponseBody
    public JSONObject chartMonitorForHigh(@RequestParam("buildingId") Integer buildingId, @RequestParam("transformerId") Integer transformerId) {
        JSONObject jsonObject = new JSONObject();
        List<Map<String, Object>> list = curDataService.selectChartMonitorForHigh(buildingId);

        jsonObject.put("data", list);

        return jsonObject;
    }
}
