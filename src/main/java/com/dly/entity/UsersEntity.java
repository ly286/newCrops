package com.dly.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName users
 */
@TableName(value ="users")
@Data
public class UsersEntity implements Serializable {
    private Long id;

    private String username;

    private String password;

    private String role;

    private Date addtime;

    private static final long serialVersionUID = 1L;
}