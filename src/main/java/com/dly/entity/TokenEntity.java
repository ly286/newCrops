package com.dly.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName token
 */
@TableName(value ="token")
@Data
public class TokenEntity implements Serializable {
    private Long id;

    private Long userid;

    private String username;

    private String tablename;

    private String role;

    private String token;

    private Date addtime;

    private Date expiratedtime;

    private static final long serialVersionUID = 1L;
}