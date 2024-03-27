package com.dly.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dly.entity.TokenEntity;
import com.dly.service.TokenService;
import com.dly.mapper.TokenMapper;
import org.springframework.stereotype.Service;

/**
* @author 30481
* @description 针对表【token(token表)】的数据库操作Service实现
* @createDate 2024-03-27 13:31:53
*/
@Service
public class TokenServiceImpl extends ServiceImpl<TokenMapper, TokenEntity>
    implements TokenService{

}




