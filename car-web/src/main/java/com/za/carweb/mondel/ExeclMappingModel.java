package com.za.carweb.mondel;

import lombok.Data;

/**
 * @outhor YSF
 * @create 2020/9/17 15:34
 */
@Data
public class ExeclMappingModel {

    /**
     * 原编码
     */
    private String originalCode;

    /**
     * 原名称
     */
    private String originalName;

    /**
     * 现编码
     */
    private String value;

    /**
     * 现名称
     */
    private String name;

    /**
     * 父编码
     */
    private String parent;

    /**
     * 调整方案
     */
    private String adjustmentPlan;
}
