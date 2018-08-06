package com.yg.omp.service.impl;

import com.yg.omp.dao.RoomDAO;
import com.yg.omp.model.Room;
import com.yg.omp.service.RoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl extends AbstractBaseServiceImpl<Room> implements RoomService {
    @Autowired
    private RoomDAO roomDAO;

    private static final Logger logger = LoggerFactory.getLogger(RoomServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = roomDAO;
    }
}