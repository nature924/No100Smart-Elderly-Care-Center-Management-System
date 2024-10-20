package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeiyongshoujiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FeiyongshoujiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FeiyongshoujiaoView;


/**
 * 费用收缴
 *
 * @author 
 * @email 
 * @date 2022-09-08 14:49:58
 */
public interface FeiyongshoujiaoService extends IService<FeiyongshoujiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeiyongshoujiaoVO> selectListVO(Wrapper<FeiyongshoujiaoEntity> wrapper);
   	
   	FeiyongshoujiaoVO selectVO(@Param("ew") Wrapper<FeiyongshoujiaoEntity> wrapper);
   	
   	List<FeiyongshoujiaoView> selectListView(Wrapper<FeiyongshoujiaoEntity> wrapper);
   	
   	FeiyongshoujiaoView selectView(@Param("ew") Wrapper<FeiyongshoujiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeiyongshoujiaoEntity> wrapper);
   	

}

