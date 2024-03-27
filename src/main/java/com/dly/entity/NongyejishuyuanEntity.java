package com.dly.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName nongyejishuyuan
 */
@TableName(value ="nongyejishuyuan")
@Data
public class NongyejishuyuanEntity implements Serializable {
    private Long id;

    private Date addtime;

    private String jishuyuanzhanghao;

    private String jishuyuanxingming;

    private String mima;

    private String xingbie;

    private String lianxifangshi;

    private String touxiang;

    private static final long serialVersionUID = 1L;
}