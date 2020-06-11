package com.xzoliver.used_market.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * managers
 * @author 
 */
@Data
public class Managers implements Serializable {
    /**
     * 管理员编号
     */
    private Integer id;

    /**
     * 密码
     */
    private String password;

    private static final long serialVersionUID = 1L;
}