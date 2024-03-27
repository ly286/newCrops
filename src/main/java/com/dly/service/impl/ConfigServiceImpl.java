package com.dly.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dly.entity.ConfigEntity;
import com.dly.service.ConfigService;
import com.dly.mapper.ConfigMapper;
import org.springframework.stereotype.Service;

/**
* @author 30481
* @description 针对表【config(配置文件)】的数据库操作Service实现
* @createDate 2024-03-27 13:31:53
*/
@Service
public class ConfigServiceImpl extends ServiceImpl<ConfigMapper, ConfigEntity>
    implements ConfigService{

}




