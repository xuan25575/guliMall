package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author huang_2
 * @email huang_2@gmail.com
 * @date 2020-09-12 00:10:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
