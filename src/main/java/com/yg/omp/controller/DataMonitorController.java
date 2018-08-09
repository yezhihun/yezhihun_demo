package com.yg.omp.controller;

import com.alibaba.fastjson.JSONObject;
import com.yg.omp.model.Building;
import com.yg.omp.model.Cabinet;
import com.yg.omp.model.Meter;
import com.yg.omp.service.BuildingService;
import com.yg.omp.service.CabinetService;
import com.yg.omp.service.CurDataService;
import com.yg.omp.service.MeterService;
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
    @Autowired
    private CabinetService cabinetService;
    @Autowired
    private MeterService meterService;

    @RequestMapping("/selectAllBuilding")
    @ResponseBody
    public JSONObject selectAllBuilding(){
        JSONObject json = new JSONObject();
        List<Building> list = buildingService.findAll();

        json.put("data", list);
        return json;
    }

    @RequestMapping("/selectCabinetByBuildingId")
    @ResponseBody
    public JSONObject selectCabinetByBuildingId(@RequestParam("buildingId")Integer buildingId){
        JSONObject json = new JSONObject();
        List<Cabinet> list = cabinetService.findByBuildingId(buildingId);

        json.put("data", list);
        return json;
    }

    @RequestMapping("/selectMeterByCabinetId")
    @ResponseBody
    public JSONObject selectMeterByCabinetId(@RequestParam("cabinetId")Integer cabinetId){
        JSONObject json = new JSONObject();
        List<Meter> list = meterService.findByCabinetId(cabinetId);

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
