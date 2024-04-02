package com.dly.entity.view;



import com.baomidou.mybatisplus.annotation.TableName;
import com.dly.entity.ZhongzigongyingshangEntity;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
 

/**
 * 种子供应商
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhongzigongyingshang")
public class ZhongzigongyingshangView  extends ZhongzigongyingshangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhongzigongyingshangView(){
	}
 
 	public ZhongzigongyingshangView(ZhongzigongyingshangEntity zhongzigongyingshangEntity){
			BeanUtils.copyProperties(this, zhongzigongyingshangEntity);

 		
	}
}
