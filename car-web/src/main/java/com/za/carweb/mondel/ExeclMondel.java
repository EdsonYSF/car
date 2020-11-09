package com.za.carweb.mondel;

import lombok.Data;

/**
 * @outhor YSF
 * @create 2020/9/17 14:03
 * 解析Execl实体类
 */
@Data
public class ExeclMondel {

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


}
