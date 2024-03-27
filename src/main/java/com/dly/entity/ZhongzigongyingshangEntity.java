package com.dly.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName zhongzigongyingshang
 */
@TableName(value ="zhongzigongyingshang")
@Data
public class ZhongzigongyingshangEntity implements Serializable {
    private Long id;

    private Date addtime;

    private String gongyingshangmingcheng;

    private String fengmian;

    private String jingyingfanwei;

    private String dizhi;

    private String dianhua;

    private String zhongzimingcheng;

    private String xiaoshoujiage;

    private Integer thumbsupnum;

    private Integer crazilynum;

    private static final long serialVersionUID = 1L;
}