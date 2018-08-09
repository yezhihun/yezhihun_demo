package com.yg.omp.service;

import com.yg.omp.model.Cabinet;

import java.util.List;

public interface CabinetService extends BaseService<Cabinet> {
    List<Cabinet> findByBuildingId(Integer buildingId);

}