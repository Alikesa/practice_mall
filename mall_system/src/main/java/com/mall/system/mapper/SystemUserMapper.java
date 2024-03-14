package com.mall.system.mapper;

import com.mall.system.domain.SystemUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Admin
* @description 针对表【system_user】的数据库操作Mapper
* @createDate 2024-03-13 14:49:56
* @Entity com.mall.system.domain.SystemUser
*/
@Mapper
public interface SystemUserMapper extends BaseMapper<SystemUser> {

}




