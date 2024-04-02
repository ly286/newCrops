package com.dly.entity.view;


import com.baomidou.mybatisplus.annotation.TableName;
import com.dly.entity.DiscussjishuEntity;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 技术评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("discussjishu")
public class DiscussjishuView  extends DiscussjishuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjishuView(){
	}
 
 	public DiscussjishuView(DiscussjishuEntity discussjishuEntity){
        BeanUtils.copyProperties(this, discussjishuEntity);

    }
}
