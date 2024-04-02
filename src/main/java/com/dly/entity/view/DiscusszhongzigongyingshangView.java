package com.dly.entity.view;


import com.baomidou.mybatisplus.annotation.TableName;
import com.dly.entity.DiscusszhongzigongyingshangEntity;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 种子供应商评论表
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("discusszhongzigongyingshang")
public class DiscusszhongzigongyingshangView extends DiscusszhongzigongyingshangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public DiscusszhongzigongyingshangView() {
    }

    public DiscusszhongzigongyingshangView(DiscusszhongzigongyingshangEntity discusszhongzigongyingshangEntity) {
        BeanUtils.copyProperties(this, discusszhongzigongyingshangEntity);


    }
}
