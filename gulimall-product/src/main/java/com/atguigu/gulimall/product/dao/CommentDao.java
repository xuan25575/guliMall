package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author huang_2
 * @email huang_2@gmail.com
 * @date 2020-09-11 22:28:09
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {
	
}
