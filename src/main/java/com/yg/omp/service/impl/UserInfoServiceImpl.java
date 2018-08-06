package com.yg.omp.service.impl;

import com.yg.omp.dao.UserInfoDAO;
import com.yg.omp.model.UserInfo;
import com.yg.omp.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends AbstractBaseServiceImpl<UserInfo> implements UserInfoService {
    @Autowired
    private UserInfoDAO userInfoDAO;

    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = userInfoDAO;
    }

}