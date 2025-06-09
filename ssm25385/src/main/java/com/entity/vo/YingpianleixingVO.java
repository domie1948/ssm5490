package com.entity.vo;

import com.entity.YingpianleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 影片类型
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 23:36:22
 */
public class YingpianleixingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 简要介绍
	 */
	
	private String jianyaojieshao;
				
	
	/**
	 * 设置：简要介绍
	 */
	 
	public void setJianyaojieshao(String jianyaojieshao) {
		this.jianyaojieshao = jianyaojieshao;
	}
	
	/**
	 * 获取：简要介绍
	 */
	public String getJianyaojieshao() {
		return jianyaojieshao;
	}
			
}
