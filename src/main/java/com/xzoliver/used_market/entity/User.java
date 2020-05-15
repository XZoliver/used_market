package com.xzoliver.used_market.entity;

import lombok.Data;

import java.io.Serializable;

/**
 *创建人：肖易安
 *创建时间：2020/5/15
 **/
@Data
public class User implements Serializable {
    private int id ;
    private String username ;
    private String password ;
    private String phone ;
    private String qq_number;
    private String wechat ;
    private int state ;
    private String head_portraits_url ;
    private String sex ;
    private String university ;

}
