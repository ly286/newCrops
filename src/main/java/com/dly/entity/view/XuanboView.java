package com.dly.entity.view;



import com.baomidou.mybatisplus.annotation.TableName;
import com.dly.entity.XuanboEntity;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 选播
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）

 */
@TableName("xuanbo")
public class XuanboView  extends XuanboEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuanboView(){
	}
 
 	public XuanboView(XuanboEntity xuanboEntity){
			BeanUtils.copyProperties(this, xuanboEntity);

 		
	}
}
