package com.yg.omp.controller;

import com.alibaba.fastjson.JSONObject;
import com.yg.omp.model.BakMeterDataHour;
import com.yg.omp.service.BakMeterDataHourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 能耗分析
 * Created by tianye on 2018/8/8.
 */
@Controller
@RequestMapping("/energyAnalysis")
public class EnergyAnalysisController {

    @Autowired
    private BakMeterDataHourService bakMeterDataHourService;

    /**
     * 趋势曲线
     * @param meterNo
     * @param time
     * @return
     */
    @RequestMapping("/trendAnalysis")
    @ResponseBody
    public JSONObject trendAnalysis(@RequestParam("meterNo") Integer meterNo, @RequestParam("time") String time){
        JSONObject jsonObject = new JSONObject();
        List<BakMeterDataHour> list = bakMeterDataHourService.selectTrendAnalysis(meterNo, time);

        jsonObject.put("data", list);
        return jsonObject;
    }

    /**
     * 温度曲线
     * @param buildingId
     * @param time
     * @return
     */
    @RequestMapping("/tempAnalysis")
    @ResponseBody
    public JSONObject tempAnalysis(@RequestParam("buildingId") Integer buildingId, @RequestParam("time") String time){
        JSONObject jsonObject = new JSONObject();

        return jsonObject;
    }
}
