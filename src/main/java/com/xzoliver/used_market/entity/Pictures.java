package com.xzoliver.used_market.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * pictures
 * @author 
 */
@Data
public class Pictures implements Serializable {
    /**
     * 图片编号
     */
    private Integer id;

    /**
     * 所属商品编号
     */
    private Integer goodsId;

    /**
     * 图片地址
     */
    private String url;

    private static final long serialVersionUID = 1L;
}