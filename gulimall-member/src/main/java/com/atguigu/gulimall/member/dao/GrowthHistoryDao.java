package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.GrowthHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长积分记录表
 * 
 * @author huang_2
 * @email huang_2@gmail.com
 * @date 2020-09-12 00:21:54
 */
@Mapper
public interface GrowthHistoryDao extends BaseMapper<GrowthHistoryEntity> {
	
}
