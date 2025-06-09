package com.entity.view;

import com.entity.YingpianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 影片信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 23:36:22
 */
@TableName("yingpianxinxi")
public class YingpianxinxiView  extends YingpianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingpianxinxiView(){
	}
 
 	public YingpianxinxiView(YingpianxinxiEntity yingpianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yingpianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
