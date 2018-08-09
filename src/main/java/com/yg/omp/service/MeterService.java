package com.yg.omp.service;

import com.yg.omp.model.Meter;

import java.util.List;

public interface MeterService extends BaseService<Meter> {

    List<Meter> findByCabinetId(Integer cabinetId);
}