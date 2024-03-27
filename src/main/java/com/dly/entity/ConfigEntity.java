package com.dly.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName config
 */
@TableName(value ="config")
@Data
public class ConfigEntity implements Serializable {
    private Long id;

    private String name;

    private String value;

    private static final long serialVersionUID = 1L;
}