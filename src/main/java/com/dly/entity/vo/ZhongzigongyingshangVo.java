package com.dly.entity.vo;

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
public class ZhongzigongyingshangVo implements Serializable {

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