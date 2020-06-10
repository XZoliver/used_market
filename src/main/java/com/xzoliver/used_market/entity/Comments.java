package com.xzoliver.used_market.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * comments
 * @author 
 */
@Data
public class Comments implements Serializable {
    /**
     * 评论编号
     */
    private Integer id;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 父评论编号
     */
    private Integer uid;

    /**
     * 商品编号
     */
    private Integer goodsId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 评论内容
     */
    private String context;

    private static final long serialVersionUID = 1L;
}