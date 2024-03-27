package com.dly.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName discussjishu
 * 技术评论表
 */
@TableName(value ="discussjishu")
@Data
public class DiscussjishuVo implements Serializable {

    //用户id
    private Long userid;
    //用户昵称
    private String nickname;
    //评论内容
    private String content;
    //回复内容
    private String reply;

    private static final long serialVersionUID = 1L;
}