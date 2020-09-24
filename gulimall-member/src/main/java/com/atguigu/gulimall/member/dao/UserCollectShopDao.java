package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.UserCollectShopEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 关注店铺表
 * 
 * @author huang_2
 * @email huang_2@gmail.com
 * @date 2020-09-12 00:21:54
 */
@Mapper
public interface UserCollectShopDao extends BaseMapper<UserCollectShopEntity> {
	
}
