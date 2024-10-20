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
 * 监控信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-09-08 14:49:58
 */
@TableName("jiankongxinxi")
public class JiankongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankongxinxiEntity() {
		
	}
	
	public JiankongxinxiEntity(T t) {
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
	 * 监控名称
	 */
					
	private String jiankongmingcheng;
	
	/**
	 * 监控封面
	 */
					
	private String jiankongfengmian;
	
	/**
	 * 监控视频
	 */
					
	private String jiankongshipin;
	
	/**
	 * 监控时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jiankongshijian;
	
	/**
	 * 监控说明
	 */
					
	private String jiankongshuoming;
	
	
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
	 * 设置：监控名称
	 */
	public void setJiankongmingcheng(String jiankongmingcheng) {
		this.jiankongmingcheng = jiankongmingcheng;
	}
	/**
	 * 获取：监控名称
	 */
	public String getJiankongmingcheng() {
		return jiankongmingcheng;
	}
	/**
	 * 设置：监控封面
	 */
	public void setJiankongfengmian(String jiankongfengmian) {
		this.jiankongfengmian = jiankongfengmian;
	}
	/**
	 * 获取：监控封面
	 */
	public String getJiankongfengmian() {
		return jiankongfengmian;
	}
	/**
	 * 设置：监控视频
	 */
	public void setJiankongshipin(String jiankongshipin) {
		this.jiankongshipin = jiankongshipin;
	}
	/**
	 * 获取：监控视频
	 */
	public String getJiankongshipin() {
		return jiankongshipin;
	}
	/**
	 * 设置：监控时间
	 */
	public void setJiankongshijian(Date jiankongshijian) {
		this.jiankongshijian = jiankongshijian;
	}
	/**
	 * 获取：监控时间
	 */
	public Date getJiankongshijian() {
		return jiankongshijian;
	}
	/**
	 * 设置：监控说明
	 */
	public void setJiankongshuoming(String jiankongshuoming) {
		this.jiankongshuoming = jiankongshuoming;
	}
	/**
	 * 获取：监控说明
	 */
	public String getJiankongshuoming() {
		return jiankongshuoming;
	}

}
