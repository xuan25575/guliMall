package com.atguigu.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.member.entity.UserLevelEntity;
import com.atguigu.gulimall.member.service.UserLevelService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 会员等级表
 *
 * @author huang_2
 * @email huang_2@gmail.com
 * @date 2020-09-12 00:21:54
 */
@RestController
@RequestMapping("member/userlevel")
public class UserLevelController {
    @Autowired
    private UserLevelService userLevelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userLevelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		UserLevelEntity userLevel = userLevelService.getById(id);

        return R.ok().put("userLevel", userLevel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UserLevelEntity userLevel){
		userLevelService.save(userLevel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UserLevelEntity userLevel){
		userLevelService.updateById(userLevel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		userLevelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
