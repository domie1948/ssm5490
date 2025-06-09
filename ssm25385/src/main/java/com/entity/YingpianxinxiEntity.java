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
 * 影片信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 23:36:22
 */
@TableName("yingpianxinxi")
public class YingpianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YingpianxinxiEntity() {
		
	}
	
	public YingpianxinxiEntity(T t) {
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
	 * 影片名称
	 */
					
	private String yingpianmingcheng;
	
	/**
	 * 影片状态
	 */
					
	private String yingpianzhuangtai;
	
	/**
	 * 影片分类
	 */
					
	private String yingpianfenlei;
	
	/**
	 * 影片封面
	 */
					
	private String yingpianfengmian;
	
	/**
	 * 影片地区
	 */
					
	private String yingpiandiqu;
	
	/**
	 * 上映时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shangyingshijian;
	
	/**
	 * 票价
	 */
					
	private Integer piaojia;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 影片详情
	 */
					
	private String yingpianxiangqing;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
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
	 * 设置：影片名称
	 */
	public void setYingpianmingcheng(String yingpianmingcheng) {
		this.yingpianmingcheng = yingpianmingcheng;
	}
	/**
	 * 获取：影片名称
	 */
	public String getYingpianmingcheng() {
		return yingpianmingcheng;
	}
	/**
	 * 设置：影片状态
	 */
	public void setYingpianzhuangtai(String yingpianzhuangtai) {
		this.yingpianzhuangtai = yingpianzhuangtai;
	}
	/**
	 * 获取：影片状态
	 */
	public String getYingpianzhuangtai() {
		return yingpianzhuangtai;
	}
	/**
	 * 设置：影片分类
	 */
	public void setYingpianfenlei(String yingpianfenlei) {
		this.yingpianfenlei = yingpianfenlei;
	}
	/**
	 * 获取：影片分类
	 */
	public String getYingpianfenlei() {
		return yingpianfenlei;
	}
	/**
	 * 设置：影片封面
	 */
	public void setYingpianfengmian(String yingpianfengmian) {
		this.yingpianfengmian = yingpianfengmian;
	}
	/**
	 * 获取：影片封面
	 */
	public String getYingpianfengmian() {
		return yingpianfengmian;
	}
	/**
	 * 设置：影片地区
	 */
	public void setYingpiandiqu(String yingpiandiqu) {
		this.yingpiandiqu = yingpiandiqu;
	}
	/**
	 * 获取：影片地区
	 */
	public String getYingpiandiqu() {
		return yingpiandiqu;
	}
	/**
	 * 设置：上映时间
	 */
	public void setShangyingshijian(Date shangyingshijian) {
		this.shangyingshijian = shangyingshijian;
	}
	/**
	 * 获取：上映时间
	 */
	public Date getShangyingshijian() {
		return shangyingshijian;
	}
	/**
	 * 设置：票价
	 */
	public void setPiaojia(Integer piaojia) {
		this.piaojia = piaojia;
	}
	/**
	 * 获取：票价
	 */
	public Integer getPiaojia() {
		return piaojia;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：影片详情
	 */
	public void setYingpianxiangqing(String yingpianxiangqing) {
		this.yingpianxiangqing = yingpianxiangqing;
	}
	/**
	 * 获取：影片详情
	 */
	public String getYingpianxiangqing() {
		return yingpianxiangqing;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
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
