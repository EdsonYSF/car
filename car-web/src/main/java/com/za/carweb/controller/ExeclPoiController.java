package com.za.carweb.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.za.carweb.mondel.ExeclMondel;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @outhor YSF
 * @create 2020/9/17 14:02
 * 解析Execl数据
 */
@Controller
public class ExeclPoiController {



    public static void main(String[] args) throws IOException, ParseException {

        String  sp="[{code=112, name=客户需求分析问卷, customerName=null, customerType=null, certType=null, certNo=null, maxNum=3, minNum=1, subType=111251, imagePathList=[{url=/api/data/downloadImage?url=8740871023200865906.png}]}]";

        JSONObject json = JSONObject.fromObject(sp);

//        com.alibaba.fastjson.JSONArray json = JSONArray.parseArray(sp);
//        List<JSONObject> list = new ArrayList<JSONObject>();
        ObjectMapper mapper = new ObjectMapper();
        JSONObject list = mapper.readValue(sp,JSONObject.class);

        System.out.println(list);


//        XSSFWorkbook book = new XSSFWorkbook("/Users/ysf/Downloads/工作簿1.xlsx");
//        XSSFSheet sheet = book.getSheetAt(0);
//        ExeclMondel execlMondel;
//        LinkedList<ExeclMondel> list=new LinkedList<>();
//        LinkedList<ExeclMondel> list2=new LinkedList<>();
//
//        for (int i = 1; i < sheet.getLastRowNum()+1; i++) {
//            execlMondel = new ExeclMondel();
//            XSSFRow row = sheet.getRow(i);
//            if (null != row) {
//                XSSFCell cell = row.getCell(2);
//                XSSFCell cell2 = row.getCell(3);
//                cell.setCellType(CellType.STRING);
//                cell2.setCellType(CellType.STRING);
//                String newCode = cell.getStringCellValue();
//                String newName = cell2.getStringCellValue();
//                //存储现编码和现名称
//                if (StringUtils.isNotBlank(newCode) && StringUtils.isNotBlank(newName)) {
//                    execlMondel.setValue(newCode); //现编码
//                    execlMondel.setName(newName); //现名称
//                    list.add(execlMondel);
//                }
//            }
//        }
//        JSONArray execlJsonArray=JSONArray.fromObject(list);
//        System.out.println(execlJsonArray);

    }



}


















