package com.yg.omp.service.impl;

import com.yg.omp.dao.CustomerDAO;
import com.yg.omp.model.Customer;
import com.yg.omp.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends AbstractBaseServiceImpl<Customer> implements CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = customerDAO;
    }
}