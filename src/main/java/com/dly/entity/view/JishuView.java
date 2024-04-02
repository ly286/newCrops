package com.dly.entity.view;



import com.baomidou.mybatisplus.annotation.TableName;
import com.dly.entity.JishuEntity;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 技术
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jishu")
public class JishuView  extends JishuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JishuView(){
	}
 
 	public JishuView(JishuEntity jishuEntity){

			BeanUtils.copyProperties(this, jishuEntity);

 		
	}
}
