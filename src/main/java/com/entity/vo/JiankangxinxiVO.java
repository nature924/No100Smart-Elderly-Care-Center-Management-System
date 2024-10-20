package com.entity.vo;

import com.entity.JiankangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-09-08 14:49:58
 */
public class JiankangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 患病史
	 */
	
	private String huanbingshi;
		
	/**
	 * 身高（cm）
	 */
	
	private String shengao;
		
	/**
	 * 体重（kg）
	 */
	
	private String tizhong;
		
	/**
	 * 心率
	 */
	
	private String xinlv;
		
	/**
	 * 血压
	 */
	
	private String xueya;
		
	/**
	 * 身体指标
	 */
	
	private String shentizhibiao;
		
	/**
	 * 健康分析
	 */
	
	private String jiankangfenxi;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：患病史
	 */
	 
	public void setHuanbingshi(String huanbingshi) {
		this.huanbingshi = huanbingshi;
	}
	
	/**
	 * 获取：患病史
	 */
	public String getHuanbingshi() {
		return huanbingshi;
	}
				
	
	/**
	 * 设置：身高（cm）
	 */
	 
	public void setShengao(String shengao) {
		this.shengao = shengao;
	}
	
	/**
	 * 获取：身高（cm）
	 */
	public String getShengao() {
		return shengao;
	}
				
	
	/**
	 * 设置：体重（kg）
	 */
	 
	public void setTizhong(String tizhong) {
		this.tizhong = tizhong;
	}
	
	/**
	 * 获取：体重（kg）
	 */
	public String getTizhong() {
		return tizhong;
	}
				
	
	/**
	 * 设置：心率
	 */
	 
	public void setXinlv(String xinlv) {
		this.xinlv = xinlv;
	}
	
	/**
	 * 获取：心率
	 */
	public String getXinlv() {
		return xinlv;
	}
				
	
	/**
	 * 设置：血压
	 */
	 
	public void setXueya(String xueya) {
		this.xueya = xueya;
	}
	
	/**
	 * 获取：血压
	 */
	public String getXueya() {
		return xueya;
	}
				
	
	/**
	 * 设置：身体指标
	 */
	 
	public void setShentizhibiao(String shentizhibiao) {
		this.shentizhibiao = shentizhibiao;
	}
	
	/**
	 * 获取：身体指标
	 */
	public String getShentizhibiao() {
		return shentizhibiao;
	}
				
	
	/**
	 * 设置：健康分析
	 */
	 
	public void setJiankangfenxi(String jiankangfenxi) {
		this.jiankangfenxi = jiankangfenxi;
	}
	
	/**
	 * 获取：健康分析
	 */
	public String getJiankangfenxi() {
		return jiankangfenxi;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
