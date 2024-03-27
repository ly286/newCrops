package com.dly.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dly.entity.UsersEntity;
import com.dly.service.UsersService;
import com.dly.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author 30481
* @description 针对表【users(用户表)】的数据库操作Service实现
* @createDate 2024-03-27 13:31:53
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, UsersEntity>
    implements UsersService{

}




