package com.dly.entity.view;


import com.baomidou.mybatisplus.annotation.TableName;
import com.dly.entity.DiscussnongzuowushougoushangEntity;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 农作物收购商评论表
 * 后端返回视图实体辅助类
 */
@TableName("discussnongzuowushougoushang")
public class DiscussnongzuowushougoushangView extends DiscussnongzuowushougoushangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public DiscussnongzuowushougoushangView() {
    }

    public DiscussnongzuowushougoushangView(DiscussnongzuowushougoushangEntity discussnongzuowushougoushangEntity) {
        BeanUtils.copyProperties(this, discussnongzuowushougoushangEntity);

    }
}
