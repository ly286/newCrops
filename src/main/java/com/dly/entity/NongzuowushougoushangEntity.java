package com.dly.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName nongzuowushougoushang
 */
@TableName(value ="nongzuowushougoushang")
@Data
public class NongzuowushougoushangEntity implements Serializable {
    private Long id;

    private Date addtime;

    private String shougoushangmingcheng;

    private String fengmian;

    private String jingyingfanwei;

    private String dizhi;

    private String dianhua;

    private String nongzuowumingcheng;

    private String shougoujiage;

    private Integer thumbsupnum;

    private Integer crazilynum;

    private static final long serialVersionUID = 1L;
}