package com.yg.omp.controller;

import com.alibaba.fastjson.JSONObject;
import com.yg.omp.model.Building;
import com.yg.omp.service.BuildingService;
import com.yg.omp.service.CurDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by tianye on 2018/8/6.
 * 数据监测
 */
@Controller
@RequestMapping("/dataMonitor")
public class DataMonitorController {

    @Autowired
    private BuildingService buildingService;
    @Autowired
    private CurDataService curDataService;

    @RequestMapping("/selectAllBuilding")
    @ResponseBody
    public JSONObject selectAllBuilding(){
        JSONObject json = new JSONObject();
        List<Building> list = buildingService.findAll();

        json.put("data", list);
        return json;
    }

    /**
     * 实时数据检测
     * @param buildingId
     * @param transformerId
     * @return
     */
    @RequestMapping("/dataMonitorRealTime")
    @ResponseBody
    public JSONObject dataMonitorRealTime(@RequestParam("buildingId")Integer buildingId, @RequestParam("transformerId") Integer transformerId){
        JSONObject jsonObject = new JSONObject();
        List<Map<String, Object>> list = curDataService.selectDataMonitorRealTime(buildingId, transformerId);

        jsonObject.put("data", list);

        return jsonObject;
    }
}
