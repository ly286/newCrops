package com.dly.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dly.entity.NonghuEntity;
import com.dly.mapper.NonghuMapper;
import com.dly.service.NonghuService;
import com.dly.utils.PageUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("nonghuService")
public class NonghuServiceImpl extends ServiceImpl<NonghuMapper, NonghuEntity> implements NonghuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NonghuEntity> page = this.selectPage(
                new Query<NonghuEntity>(params).getPage(),
                new EntityWrapper<NonghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NonghuEntity> wrapper) {
		  Page<NonghuView> page =new Query<NonghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NonghuVO> selectListVO(Wrapper<NonghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NonghuVO selectVO(Wrapper<NonghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NonghuView> selectListView(Wrapper<NonghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NonghuView selectView(Wrapper<NonghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
