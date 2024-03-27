package com.dly.entity.vo;

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
public class StoreupVo implements Serializable {
    //收藏id
    private Long refid;

    private String tablename;

    private String name;

    private String picture;
    //类型(收藏，赞，踩)
    private String type;
    //推荐类型
    private String inteltype;

    private static final long serialVersionUID = 1L;
}