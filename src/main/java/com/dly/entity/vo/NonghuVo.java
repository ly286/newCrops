package com.dly.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName nonghu
 */
@TableName(value ="nonghu")
@Data
public class NonghuVo implements Serializable {


    private String nonghuxingming;

    private String mima;

    private String xingbie;

    private String lianxifangshi;

    private String touxiang;

    private static final long serialVersionUID = 1L;
}