package com.yg.omp.service.impl;

import com.yg.omp.service.CurDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by tianye on 2018/8/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/spring-application.xml")
public class CurDataServiceImplTest {
    @Autowired
    private CurDataService curDataService;

    @Test
    public void selectChartMonitorForHigh() throws Exception {
        curDataService.selectChartMonitorForHigh(1);
    }

    @Test
    public void selectChartMonitorForLow() throws Exception {

    }

    @Test
    public void selectDataMonitorRealTime() throws Exception {

    }

}