package com.tuling.mutiple.datasource.vo;

import lombok.Data;

/**
 * @author gsd
 */
@Data
public class OrderVo {
    private String userId;
    /**商品编号**/
    private String commodityCode;
    
    private Integer count;
    
    private Integer money;
}
