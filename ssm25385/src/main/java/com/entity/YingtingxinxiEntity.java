package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 影厅信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 23:36:23
 */
@TableName("yingtingxinxi")
public class YingtingxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YingtingxinxiEntity() {
		
	}
	
	public YingtingxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 影厅名称
	 */
					
	private String yingtingmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：影厅名称
	 */
	public void setYingtingmingcheng(String yingtingmingcheng) {
		this.yingtingmingcheng = yingtingmingcheng;
	}
	/**
	 * 获取：影厅名称
	 */
	public String getYingtingmingcheng() {
		return yingtingmingcheng;
	}
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
