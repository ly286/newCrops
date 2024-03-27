package com.dly.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName storeup
 */
@TableName(value ="storeup")
@Data
public class StoreupEntity implements Serializable {
    private Long id;

    private Date addtime;

    private Long userid;

    private Long refid;

    private String tablename;

    private String name;

    private String picture;

    private String type;

    private String inteltype;

    private static final long serialVersionUID = 1L;
}