package com.xzoliver.used_market.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * goods
 * @author 
 */
@Data
public class Users implements Serializable {
    /**
     * 商品编号
     */
    private Integer id;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 商品类型
     */
    private Integer type;

    /**
     * 商品售价
     */
    private Double nowPrice;

    /**
     * 商品原价
     */
    private Double oldPrice;

    /**
     * 所属用户编号
     */
    private Integer userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 下架时间
     */
    private Date endTime;

    /**
     * 评论数
     */
    private Integer commentsNumber;

    /**
     * 状态
     */
    private Integer state;

    private static final long serialVersionUID = 1L;
}