package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author huang_2
 * @email huang_2@gmail.com
 * @date 2020-09-12 00:21:55
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
