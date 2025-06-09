package com.entity.vo;

import com.entity.YingpiandingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 影片订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 23:36:23
 */
public class YingpiandingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 票价
	 */
	
	private String piaojia;
		
	/**
	 * 数量
	 */
	
	private String shuliang;
		
	/**
	 * 总价
	 */
	
	private String zongjia;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
				
	
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
	 * 设置：票价
	 */
	 
	public void setPiaojia(String piaojia) {
		this.piaojia = piaojia;
	}
	
	/**
	 * 获取：票价
	 */
	public String getPiaojia() {
		return piaojia;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：总价
	 */
	 
	public void setZongjia(String zongjia) {
		this.zongjia = zongjia;
	}
	
	/**
	 * 获取：总价
	 */
	public String getZongjia() {
		return zongjia;
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
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
			
}
