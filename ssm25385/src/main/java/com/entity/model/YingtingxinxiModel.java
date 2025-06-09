package com.entity.model;

import com.entity.YingtingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 影厅信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 23:36:23
 */
public class YingtingxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 影厅封面
	 */
	
	private String yingtingfengmian;
		
	/**
	 * 影厅位置
	 */
	
	private String yingtingweizhi;
		
	/**
	 * 观影人数
	 */
	
	private Integer guanyingrenshu;
		
	/**
	 * 详细介绍
	 */
	
	private String xiangxijieshao;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：影厅封面
	 */
	 
	public void setYingtingfengmian(String yingtingfengmian) {
		this.yingtingfengmian = yingtingfengmian;
	}
	
	/**
	 * 获取：影厅封面
	 */
	public String getYingtingfengmian() {
		return yingtingfengmian;
	}
				
	
	/**
	 * 设置：影厅位置
	 */
	 
	public void setYingtingweizhi(String yingtingweizhi) {
		this.yingtingweizhi = yingtingweizhi;
	}
	
	/**
	 * 获取：影厅位置
	 */
	public String getYingtingweizhi() {
		return yingtingweizhi;
	}
				
	
	/**
	 * 设置：观影人数
	 */
	 
	public void setGuanyingrenshu(Integer guanyingrenshu) {
		this.guanyingrenshu = guanyingrenshu;
	}
	
	/**
	 * 获取：观影人数
	 */
	public Integer getGuanyingrenshu() {
		return guanyingrenshu;
	}
				
	
	/**
	 * 设置：详细介绍
	 */
	 
	public void setXiangxijieshao(String xiangxijieshao) {
		this.xiangxijieshao = xiangxijieshao;
	}
	
	/**
	 * 获取：详细介绍
	 */
	public String getXiangxijieshao() {
		return xiangxijieshao;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
