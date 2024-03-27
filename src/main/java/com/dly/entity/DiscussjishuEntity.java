package com.dly.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName discussjishu
 */
@TableName(value ="discussjishu")
@Data
public class DiscussjishuEntity implements Serializable {
    private Long id;

    private Date addtime;

    private Long refid;

    private Long userid;

    private String nickname;

    private String content;

    private String reply;

    private static final long serialVersionUID = 1L;
}