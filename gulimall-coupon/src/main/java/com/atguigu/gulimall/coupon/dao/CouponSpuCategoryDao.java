package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponSpuCategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券分类关联
 * 
 * @author huang_2
 * @email huang_2@gmail.com
 * @date 2020-09-12 00:23:04
 */
@Mapper
public interface CouponSpuCategoryDao extends BaseMapper<CouponSpuCategoryEntity> {
	
}
