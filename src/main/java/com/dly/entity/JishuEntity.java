package com.dly.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName jishu
 */
@TableName(value ="jishu")
@Data
public class JishuEntity implements Serializable {
    private Long id;

    private Date addtime;

    private String nongzuowumingcheng;

    private String tupian;

    private String zhuyaobingchonghai;

    private String fangzhifangfa;

    private String jishuyuanzhanghao;

    private String jishuyuanxingming;

    private String lianxifangshi;

    private Date fabushijian;

    private Integer thumbsupnum;

    private Integer crazilynum;

    private static final long serialVersionUID = 1L;
}