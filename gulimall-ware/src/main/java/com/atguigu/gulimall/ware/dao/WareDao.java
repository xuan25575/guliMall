package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author huang_2
 * @email huang_2@gmail.com
 * @date 2020-09-12 00:23:57
 */
@Mapper
public interface WareDao extends BaseMapper<WareEntity> {
	
}
