package com.dly.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName discusszhongzigongyingshang
 */
@TableName(value ="discusszhongzigongyingshang")
@Data
public class DiscusszhongzigongyingshangVo implements Serializable {

    private Long userid;

    private String nickname;

    private String content;

    private String reply;

    private static final long serialVersionUID = 1L;
}