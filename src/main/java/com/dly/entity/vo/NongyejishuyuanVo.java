package com.dly.entity.vo;

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
public class NongyejishuyuanVo implements Serializable {


    private String jishuyuanxingming;

    private String mima;

    private String xingbie;

    private String lianxifangshi;

    private String touxiang;

    private static final long serialVersionUID = 1L;
}