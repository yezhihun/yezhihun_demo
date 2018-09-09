package com.yg.omp.controller;

import com.alibaba.fastjson.JSONObject;
import com.yg.omp.service.BakMeterDataHourService;
import com.yg.omp.service.ReportDailyService;
import com.yg.omp.service.ReportMonthlyService;
import com.yg.omp.utils.ExcelUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.Map;

/**
 * 系统报表
 * Created by tianye on 2018/8/8.
 */
@Controller
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private BakMeterDataHourService bakMeterDataHourService;
    @Autowired
    private ReportDailyService reportDailyService;
    @Autowired
    private ReportMonthlyService reportMonthlyService;

    /**
     * 定时抄表
     * @param buildingId
     * @param time
     * @return
     */
    @RequestMapping("/timerMeter")
    @ResponseBody
    public JSONObject timerMeter(@RequestParam("buildingId") Integer buildingId, @RequestParam("time") String time){
        JSONObject jsonObject = new JSONObject();

//        Date dateTime = null;
//        if (time!=null){
//            dateTime = DateUtil.formatting(time, DateUtil.FORMATTING_DATETIME);
//        }

        List<Map<String, Object>> list = bakMeterDataHourService.selectTimerMeter(buildingId, time);

        jsonObject.put("data", list);
        return jsonObject;
    }

    /**
     * 导出定时抄表
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/exportTimerMeter")
    public String exportTimerMeter(HttpServletRequest request, HttpServletResponse response){
        String buildingId = request.getParameter("buildingId");
        String time = request.getParameter("time");

        String title = "回路抄表";
        String[] header = {"回路编号","回路名称","Ua","Ub","Uc","Uab","Ubc","Uac","Ia","Ib","Ic","IL","Pz","Qz","Pf","F","EPI"};
        String[] columns = {"loopNo","loopName","curdataUa","curdataUb","curdataUc","curdataUab","curdataUbc","curdataUac","curdataIa","curdataIb","curdataIc","curdataSparefloat01","curdataPz",
                "curdataQz","curdataPf","curdataF","curdataEpi"};
        List<Map<String, Object>> data = bakMeterDataHourService.selectTimerMeter(Integer.valueOf(buildingId), time);

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            XSSFWorkbook workbook = ExcelUtil.exportExcel(title, header, columns, data);
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            workbook.write(os);
            byte[] content = os.toByteArray();
            InputStream is = new ByteArrayInputStream(content);
            // 设置response参数，可以打开下载页面
            response.reset();
            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename="
                    + new String((title + ".xlsx").getBytes(), "iso-8859-1"));
            ServletOutputStream out = response.getOutputStream();

            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(bis!=null){
                    bis.close();
                }
                if(bos!=null){
                    bos.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 回路抄表
     * @param meterNo
     * @param startTime
     * @param endTime
     * @return
     */
    @RequestMapping("/loopMeter")
    @ResponseBody
    public JSONObject loopMeter(@RequestParam("meterNo") String meterNo, @RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime){
        JSONObject jsonObject = new JSONObject();
//        Date startDate = null;
//        Date endDate = null;
//        if (startTime!=null){
//            startDate = DateUtil.formatting(startTime, DateUtil.FORMATTING_DATETIME);
//            endDate = DateUtil.formatting(endTime, DateUtil.FORMATTING_DATETIME);
//        }
        List<Map<String, Object>> list = bakMeterDataHourService.selectLoopMeter(meterNo, startTime, endTime);

        jsonObject.put("data", list);

        return jsonObject;
    }

    /**
     * 导出回路抄表
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/exportLoopMeter")
    public String exportLoopMeter(HttpServletRequest request, HttpServletResponse response){
        String meterNo = request.getParameter("meterNo");
        String startTime = request.getParameter("startTime");
        String endTime = request.getParameter("endTime");

        String title = "回路抄表";
        String[] header = {"变电所","回路编号","回路名称","抄表时间","Ua","Ub","Uc","Uab","Ubc","Uac","Ia","Ib","Ic","IL","Pz","Qz","Pf","F","EPI"};
        String[] columns = {"buildingName","loopNo","loopName","bakmeterdataFormatTime","curdataUa","curdataUb","curdataUc","curdataUab","curdataUbc","curdataUac","curdataIa","curdataIb","curdataIc","curdataSparefloat01","curdataPz",
                "curdataQz","curdataPf","curdataF","curdataEpi"};
        List<Map<String, Object>> data = bakMeterDataHourService.selectLoopMeter(meterNo, startTime, endTime);

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            XSSFWorkbook workbook = ExcelUtil.exportExcel(title, header, columns, data);
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            workbook.write(os);
            byte[] content = os.toByteArray();
            InputStream is = new ByteArrayInputStream(content);
            // 设置response参数，可以打开下载页面
            response.reset();
            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename="
                    + new String((title + ".xlsx").getBytes(), "iso-8859-1"));
            ServletOutputStream out = response.getOutputStream();

            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(bis!=null){
                    bis.close();
                }
                if(bos!=null){
                    bos.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 用电抄表
     * @param buildingId
     * @param startTime
     * @param endTime
     * @return
     */
    @RequestMapping("/electricityMeter")
    @ResponseBody
    public JSONObject electricityMeter(@RequestParam("buildingId") Integer buildingId, @RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime){
        JSONObject jsonObject = new JSONObject();
//        Date startDate = null;
//        Date endDate = null;
//        if (startTime!=null){
//            startDate = DateUtil.formatting(startTime, DateUtil.FORMATTING_DATETIME);
//            endDate = DateUtil.formatting(endTime, DateUtil.FORMATTING_DATETIME);
//        }
        List<Map<String, Object>> list = bakMeterDataHourService.selectElectricityMeter(buildingId, startTime, endTime);

        jsonObject.put("data", list);

        return jsonObject;
    }

    /**
     * 导出用电抄表
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/exportElectricityMeter")
    public String exportElectricityMeter(HttpServletRequest request, HttpServletResponse response){
        String buildingId = request.getParameter("buildingId");
        String startTime = request.getParameter("startTime");
        String endTime = request.getParameter("endTime");

        String title = "用电抄表";
        String[] header = {"回路标号","回路名称","初始抄见数","终止抄见数","用电量"};
        String[] columns = {"loopNo","loopName","startCurdataEpi","endCurdataEpi","curdataEpi"};
        List<Map<String, Object>> data = bakMeterDataHourService.selectElectricityMeter(Integer.valueOf(buildingId), startTime, endTime);

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            XSSFWorkbook workbook = ExcelUtil.exportExcel(title, header, columns, data);
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            workbook.write(os);
            byte[] content = os.toByteArray();
            InputStream is = new ByteArrayInputStream(content);
            // 设置response参数，可以打开下载页面
            response.reset();
            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename="
                    + new String((title + ".xlsx").getBytes(), "iso-8859-1"));
            ServletOutputStream out = response.getOutputStream();

            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(bis!=null){
                    bis.close();
                }
                if(bos!=null){
                    bos.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 日报表
     * @param buildingId
     * @param time
     * @return
     */
    @RequestMapping("/dayReport")
    @ResponseBody
    public JSONObject dailyReport(@RequestParam("buildingId") Integer buildingId, @RequestParam("time") String time){
        JSONObject jsonObject = new JSONObject();
//        Date dateTime = null;
//        if (time!=null){
//            dateTime = DateUtil.formatting(time, DateUtil.FORMATTING_DATETIME);
//        }
        List<Map<String, Object>> list = reportDailyService.selectDailyReport(buildingId, time);

        jsonObject.put("data", list);

        return jsonObject;
    }

    /**
     * 导出月报表
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/exportDayReport")
    public String exportDayReport(HttpServletRequest request, HttpServletResponse response){
        String buildingId = request.getParameter("buildingId");
        String time = request.getParameter("time");

        String title = "日报表";
        String[] header = {"变压器","回路编号","回路名称","1时","2时","3时","4时","5时","6时","7时","8时","9时","10时",
                "11时","12时","13时","14时","15时","16时","17时","18时","19时","20时","21时","22时","23时","24时","总计"};
        String[] columns = {"transformerName","loopNo","loopName","dataHour01","dataHour02","dataHour03","dataHour04","dataHour05","dataHour06","dataHour07","dataHour08","dataHour09","dataHour10","dataHour11",
                "dataHour12","dataHour13","dataHour14","dataHour15","dataHour16","dataHour17","dataHour18","dataHour19","dataHour20","dataHour21","dataHour22","dataHour23","dataTotal"};
        List<Map<String, Object>> data = reportDailyService.selectDailyReport(Integer.valueOf(buildingId), time);

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            XSSFWorkbook workbook = ExcelUtil.exportExcel(title, header, columns, data);
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            workbook.write(os);
            byte[] content = os.toByteArray();
            InputStream is = new ByteArrayInputStream(content);
            // 设置response参数，可以打开下载页面
            response.reset();
            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename="
                    + new String((title + ".xlsx").getBytes(), "iso-8859-1"));
            ServletOutputStream out = response.getOutputStream();

            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(bis!=null){
                    bis.close();
                }
                if(bos!=null){
                    bos.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 月报表
     * @param buildingId
     * @param time
     * @return
     */
    @RequestMapping("/monthlyReport")
    @ResponseBody
    public JSONObject monthlyReport(@RequestParam("buildingId") Integer buildingId, @RequestParam("time") String time){
        JSONObject jsonObject = new JSONObject();
//        Date dateTime = null;
//        if (time!=null){
//            dateTime = DateUtil.formatting(time, DateUtil.FORMATTING_DATETIME);
//        }
        List<Map<String, Object>> list = reportMonthlyService.selectMonthlyReport(buildingId, time);

        jsonObject.put("data", list);

        return jsonObject;
    }

    /**
     * 导出月报表
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/exportMonthlyReport")
    public String exportMonthlyReport(HttpServletRequest request, HttpServletResponse response){
        String buildingId = request.getParameter("buildingId");
        String time = request.getParameter("time");

        String title = "月报表";
        String[] header = {"变压器","回路编号","回路名称","1日","2日","3日","4日","5日","6日","7日","8日","9日","10日",
                "11日","12日","13日","14日","15日","16日","17日","18日","19日","20日","21日","22日","23日","24日","25日","26日",
                "27日","28日","29日","30日","31日","总计"};
        String[] columns = {"transformerName","loopNo","loopName","dataDate01","dataDate02","dataDate03","dataDate04","dataDate05","dataDate06","dataDate07","dataDate08","dataDate09","dataDate10","dataDate11",
                "dataDate12","dataDate13","dataDate14","dataDate15","dataDate16","dataDate17","dataDate18","dataDate19","dataDate20","dataDate21","dataDate22","dataDate23",
                "dataDate24","dataDate25","dataDate26","dataDate27","dataDate28","dataDate29","dataDate30","dataDate31","dataTotal"};
        List<Map<String, Object>> data = reportMonthlyService.selectMonthlyReport(Integer.valueOf(buildingId), time);

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            XSSFWorkbook workbook = ExcelUtil.exportExcel(title, header, columns, data);
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            workbook.write(os);
            byte[] content = os.toByteArray();
            InputStream is = new ByteArrayInputStream(content);
            // 设置response参数，可以打开下载页面
            response.reset();
            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename="
                    + new String((title + ".xlsx").getBytes(), "iso-8859-1"));
            ServletOutputStream out = response.getOutputStream();

            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(bis!=null){
                    bis.close();
                }
                if(bos!=null){
                    bos.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
