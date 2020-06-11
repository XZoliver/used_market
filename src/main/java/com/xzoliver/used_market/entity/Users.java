package com.xzoliver.used_market.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * users
 * @author 
 */
@Data
public class Users implements Serializable {
    /**
     * 用户编号
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * qq
     */
    private String qqNumber;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 用户状态
     */
    private Integer state;

    /**
     * 头像地址
     */
    private String headPortraitsUrl;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 所属大学
     */
    private String university;

    private static final long serialVersionUID = 1L;
}