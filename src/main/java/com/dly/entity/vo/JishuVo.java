package com.dly.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @TableName jishu
 */
@TableName(value ="jishu")
@Data
public class JishuVo implements Serializable {

    //图片
    private String tupian;

    private String zhuyaobingchonghai;

    private String fangzhifangfa;

    private String jishuyuanzhanghao;

    private String jishuyuanxingming;

    private String lianxifangshi;

    @DateTimeFormat
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fabushijian;

    //点赞
    private Integer thumbsupnum;
    //踩
    private Integer crazilynum;

    private static final long serialVersionUID = 1L;
}