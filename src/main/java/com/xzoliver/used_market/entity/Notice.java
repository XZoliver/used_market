package com.xzoliver.used_market.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * notice
 * @author 
 */
@Data
public class Notice implements Serializable {
    /**
     * 公告编号
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 公告内容
     */
    private String text;

    /**
     * 图片链接
     */
    private String pictureUrl;

    private static final long serialVersionUID = 1L;
}