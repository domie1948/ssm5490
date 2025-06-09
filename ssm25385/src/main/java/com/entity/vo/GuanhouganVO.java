package com.entity.vo;

import com.entity.GuanhouganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 观后感
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 23:36:23
 */
public class GuanhouganVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
