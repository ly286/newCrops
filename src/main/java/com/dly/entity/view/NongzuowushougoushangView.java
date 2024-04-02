package com.dly.entity.view;



import com.baomidou.mybatisplus.annotation.TableName;
import com.dly.entity.NongzuowushougoushangEntity;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 农作物收购商
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("nongzuowushougoushang")
public class NongzuowushougoushangView  extends NongzuowushougoushangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongzuowushougoushangView(){
	}
 
 	public NongzuowushougoushangView(NongzuowushougoushangEntity nongzuowushougoushangEntity){
			BeanUtils.copyProperties(this, nongzuowushougoushangEntity);

 		
	}
}
