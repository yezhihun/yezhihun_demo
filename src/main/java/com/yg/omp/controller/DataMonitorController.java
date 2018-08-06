package com.yg.omp.controller;

import com.alibaba.fastjson.JSONObject;
import com.yg.omp.model.Building;
import com.yg.omp.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by tianye on 2018/8/6.
 * 数据监测
 */
@Controller
@RequestMapping("/dataMonitor")
public class DataMonitorController {

    @Autowired
    private BuildingService buildingService;

    @RequestMapping("/selectAllBuilding")
    @ResponseBody
    public JSONObject selectAllBuilding(){
        JSONObject json = new JSONObject();
        List<Building> list = buildingService.findAll();

        json.put("data", list);
        return json;
    }
}
