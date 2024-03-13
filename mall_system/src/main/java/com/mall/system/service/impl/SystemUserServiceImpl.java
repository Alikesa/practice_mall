package com.mall.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.system.domain.SystemUser;
import com.mall.system.service.SystemUserService;
import com.mall.system.mapper.SystemUserMapper;
import org.springframework.stereotype.Service;

/**
* @author Admin
* @description 针对表【system_user】的数据库操作Service实现
* @createDate 2024-03-13 14:49:56
*/
@Service
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser>
    implements SystemUserService{

}




