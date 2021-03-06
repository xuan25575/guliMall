package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.CommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author huang_2
 * @email huang_2@gmail.com
 * @date 2020-09-11 22:28:09
 */
public interface CommentService extends IService<CommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

