package com.entity.view;

import com.entity.FeiyongshoujiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 费用收缴
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-09-08 14:49:58
 */
@TableName("feiyongshoujiao")
public class FeiyongshoujiaoView  extends FeiyongshoujiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FeiyongshoujiaoView(){
	}
 
 	public FeiyongshoujiaoView(FeiyongshoujiaoEntity feiyongshoujiaoEntity){
 	try {
			BeanUtils.copyProperties(this, feiyongshoujiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
