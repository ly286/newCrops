package com.dly.entity.view;



import com.baomidou.mybatisplus.annotation.TableName;
import com.dly.entity.StoreupEntity;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 收藏表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）

 */
@TableName("storeup")
public class StoreupView  extends StoreupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public StoreupView(){
	}
 
 	public StoreupView(StoreupEntity storeupEntity){
			BeanUtils.copyProperties(this, storeupEntity);

 		
	}
}
