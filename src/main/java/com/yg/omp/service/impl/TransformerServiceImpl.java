package com.yg.omp.service.impl;

import com.yg.omp.dao.TransformerDAO;
import com.yg.omp.model.Transformer;
import com.yg.omp.service.TransformerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransformerServiceImpl extends AbstractBaseServiceImpl<Transformer> implements TransformerService {
    @Autowired
    private TransformerDAO transformerDAO;

    private static final Logger logger = LoggerFactory.getLogger(TransformerServiceImpl.class);

    @Override
    public void init() {
        this.baseDao = transformerDAO;
    }
}