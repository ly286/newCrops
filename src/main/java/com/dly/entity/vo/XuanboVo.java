package com.dly.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName xuanbo
 */
@TableName(value ="xuanbo")
@Data
public class XuanboVo implements Serializable {

    private String tupian;

    private String turangshiduyaoqiu;

    private String tianqiyaoqiu;

    private String zhuyishixiang;

    private String jishuyuanzhanghao;

    private String jishuyuanxingming;

    private Integer thumbsupnum;

    private Integer crazilynum;

    private static final long serialVersionUID = 1L;
}