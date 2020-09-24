package com.atguigu.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.coupon.entity.CouponSpuEntity;
import com.atguigu.gulimall.coupon.service.CouponSpuService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 优惠券与产品关联
 *
 * @author huang_2
 * @email huang_2@gmail.com
 * @date 2020-09-12 00:23:04
 */
@RestController
@RequestMapping("coupon/couponspu")
public class CouponSpuController {
    @Autowired
    private CouponSpuService couponSpuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponSpuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponSpuEntity couponSpu = couponSpuService.getById(id);

        return R.ok().put("couponSpu", couponSpu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponSpuEntity couponSpu){
		couponSpuService.save(couponSpu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponSpuEntity couponSpu){
		couponSpuService.updateById(couponSpu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponSpuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
