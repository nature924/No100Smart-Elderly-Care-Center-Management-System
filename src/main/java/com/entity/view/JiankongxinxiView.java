package com.entity.view;

import com.entity.JiankongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 监控信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-09-08 14:49:58
 */
@TableName("jiankongxinxi")
public class JiankongxinxiView  extends JiankongxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankongxinxiView(){
	}
 
 	public JiankongxinxiView(JiankongxinxiEntity jiankongxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jiankongxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
