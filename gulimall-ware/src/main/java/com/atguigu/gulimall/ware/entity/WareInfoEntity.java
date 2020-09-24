package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ?ֿ???Ϣ
 * 
 * @author huang_2
 * @email huang_2@gmail.com
 * @date 2020-09-12 00:23:57
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ?ֿ???
	 */
	private String name;
	/**
	 * ?ֿ???ַ
	 */
	private String address;
	/**
	 * ???????
	 */
	private String areacode;

}
