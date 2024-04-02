package com.dly.service;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dly.entity.NonghuEntity;
import com.dly.entity.view.NonghuView;
import com.dly.entity.vo.NonghuVO;
import com.dly.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 农户
 *
 * @author 
 * @email 
 * @date 2022-04-17 16:47:13
 */
public interface NonghuService extends IService<NonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NonghuVO> selectListVO(Wrapper<NonghuEntity> wrapper);
   	
   	NonghuVO selectVO(@Param("ew") Wrapper<NonghuEntity> wrapper);
   	
   	List<NonghuView> selectListView(Wrapper<NonghuEntity> wrapper);
   	
   	NonghuView selectView(@Param("ew") Wrapper<NonghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NonghuEntity> wrapper);
   	

}

