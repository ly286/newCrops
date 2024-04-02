package com.dly.entity.view;


import com.baomidou.mybatisplus.annotation.TableName;
import com.dly.entity.NongyejishuyuanEntity;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 农业技术员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）

 */
@TableName("nongyejishuyuan")
public class NongyejishuyuanView  extends NongyejishuyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongyejishuyuanView(){
	}
 
 	public NongyejishuyuanView(NongyejishuyuanEntity nongyejishuyuanEntity){
			BeanUtils.copyProperties(this, nongyejishuyuanEntity);

 		
	}
}
