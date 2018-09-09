package com.yg.omp.controller;

import com.alibaba.fastjson.JSONObject;
import com.yg.omp.service.BakMeterDataHourService;
import com.yg.omp.service.ReportDailyService;
import com.yg.omp.service.ReportMonthlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 系统报表
 * Created by tianye on 2018/8/8.
 */
@Controller
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private BakMeterDataHourService bakMeterDataHourService;
    @Autowired
    private ReportDailyService reportDailyService;
    @Autowired
    private ReportMonthlyService reportMonthlyService;

    /**
     * 定时抄表
     * @param buildingId
     * @param time
     * @return
     */
    @RequestMapping("/timerMeter")
    @ResponseBody
    public JSONObject timerMeter(@RequestParam("buildingId") Integer buildingId, @RequestParam("time") String time){
        JSONObject jsonObject = new JSONObject();

//        Date dateTime = null;
//        if (time!=null){
//            dateTime = DateUtil.formatting(time, DateUtil.FORMATTING_DATETIME);
//        }

        List<Map<String, Object>> list = bakMeterDataHourService.selectTimerMeter(buildingId, time);

        jsonObject.put("data", list);
        return jsonObject;
    }

    /**
     * 回路抄表
     * @param meterNo
     * @param startTime
     * @param endTime
     * @return
     */
    @RequestMapping("/loopMeter")
    @ResponseBody
    public JSONObject loopMeter(@RequestParam("meterNo") String meterNo, @RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime){
        JSONObject jsonObject = new JSONObject();
//        Date startDate = null;
//        Date endDate = null;
//        if (startTime!=null){
//            startDate = DateUtil.formatting(startTime, DateUtil.FORMATTING_DATETIME);
//            endDate = DateUtil.formatting(endTime, DateUtil.FORMATTING_DATETIME);
//        }
        List<Map<String, Object>> list = bakMeterDataHourService.selectLoopMeter(meterNo, startTime, endTime);

        jsonObject.put("data", list);

        return jsonObject;
    }

    /**
     * 用电抄表
     * @param buildingId
     * @param startTime
     * @param endTime
     * @return
     */
    @RequestMapping("/electricityMeter")
    @ResponseBody
    public JSONObject electricityMeter(@RequestParam("buildingId") Integer buildingId, @RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime){
        JSONObject jsonObject = new JSONObject();
//        Date startDate = null;
//        Date endDate = null;
//        if (startTime!=null){
//            startDate = DateUtil.formatting(startTime, DateUtil.FORMATTING_DATETIME);
//            endDate = DateUtil.formatting(endTime, DateUtil.FORMATTING_DATETIME);
//        }
        List<Map<String, Object>> list = bakMeterDataHourService.selectElectricityMeter(buildingId, startTime, endTime);

        jsonObject.put("data", list);

        return jsonObject;
    }

    /**
     * 日报表
     * @param buildingId
     * @param time
     * @return
     */
    @RequestMapping("/dayReport")
    @ResponseBody
    public JSONObject dailyReport(@RequestParam("buildingId") Integer buildingId, @RequestParam("time") String time){
        JSONObject jsonObject = new JSONObject();
//        Date dateTime = null;
//        if (time!=null){
//            dateTime = DateUtil.formatting(time, DateUtil.FORMATTING_DATETIME);
//        }
        List<Map<String, Object>> list = reportDailyService.selectDailyReport(buildingId, time);

        jsonObject.put("data", list);

        return jsonObject;
    }

    /**
     * 日报表
     * @param buildingId
     * @param time
     * @return
     */
    @RequestMapping("/monthlyReport")
    @ResponseBody
    public JSONObject monthlyReport(@RequestParam("buildingId") Integer buildingId, @RequestParam("time") String time){
        JSONObject jsonObject = new JSONObject();
//        Date dateTime = null;
//        if (time!=null){
//            dateTime = DateUtil.formatting(time, DateUtil.FORMATTING_DATETIME);
//        }
        List<Map<String, Object>> list = reportMonthlyService.selectMonthlyReport(buildingId, time);

        jsonObject.put("data", list);

        return jsonObject;
    }
}
