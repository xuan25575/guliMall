package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. mybatis plus 整合
 * 依赖
 *
 *          <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.3.1</version>
 *         </dependency>
 * 2.配置
 *  1.配置数据源
 *  2.配置 mybatis-plus
 *    1. @MapperScan 指定包扫描
 *    2. 通过yml配置
 *
 *
 *
 * 配置实现 MybatisPlusProperties，MybatisPlusAutoConfiguration
 *
 *
 *
 */
@MapperScan(basePackages = "com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class,args);
    }
}
