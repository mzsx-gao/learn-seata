package com.tuling.mutiple.datasource.entity;

import lombok.Data;

/**
 * @author gsd
 */
@Data
public class Order {
    private Integer id;
    
    private String userId;
    /** ååįžå· */
    private String commodityCode;
    
    private Integer count;
    
    private Integer money;
    
    private Integer status;
}
