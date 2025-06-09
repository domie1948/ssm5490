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
 * 观后感
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 23:36:23
 */
@TableName("guanhougan")
public class GuanhouganEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GuanhouganEntity() {
		
	}
	
	public GuanhouganEntity(T t) {
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
	 * 影片分类
	 */
					
	private String yingpianfenlei;
	
	/**
	 * 影片封面
	 */
					
	private String yingpianfengmian;
	
	/**
	 * 上映时间
	 */
					
	private String shangyingshijian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 评即
	 */
					
	private String pingji;
	
	/**
	 * 评语
	 */
					
	private String pingyu;
	
	
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
	 * 设置：上映时间
	 */
	public void setShangyingshijian(String shangyingshijian) {
		this.shangyingshijian = shangyingshijian;
	}
	/**
	 * 获取：上映时间
	 */
	public String getShangyingshijian() {
		return shangyingshijian;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：评即
	 */
	public void setPingji(String pingji) {
		this.pingji = pingji;
	}
	/**
	 * 获取：评即
	 */
	public String getPingji() {
		return pingji;
	}
	/**
	 * 设置：评语
	 */
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}

}
