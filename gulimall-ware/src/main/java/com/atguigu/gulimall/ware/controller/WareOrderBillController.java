package com.atguigu.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.ware.entity.WareOrderBillEntity;
import com.atguigu.gulimall.ware.service.WareOrderBillService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 库存工作单
 *
 * @author huang_2
 * @email huang_2@gmail.com
 * @date 2020-09-12 00:23:57
 */
@RestController
@RequestMapping("ware/wareorderbill")
public class WareOrderBillController {
    @Autowired
    private WareOrderBillService wareOrderBillService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wareOrderBillService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		WareOrderBillEntity wareOrderBill = wareOrderBillService.getById(id);

        return R.ok().put("wareOrderBill", wareOrderBill);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WareOrderBillEntity wareOrderBill){
		wareOrderBillService.save(wareOrderBill);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WareOrderBillEntity wareOrderBill){
		wareOrderBillService.updateById(wareOrderBill);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		wareOrderBillService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
