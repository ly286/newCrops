package com.dly.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName discussxuanbo
 */
@TableName(value ="discussxuanbo")
@Data
public class DiscussxuanboVo implements Serializable {

    private Long userid;

    private String nickname;

    private String content;

    private String reply;

    private static final long serialVersionUID = 1L;
}