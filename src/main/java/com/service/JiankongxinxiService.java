package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankongxinxiView;


/**
 * 监控信息
 *
 * @author 
 * @email 
 * @date 2022-09-08 14:49:58
 */
public interface JiankongxinxiService extends IService<JiankongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankongxinxiVO> selectListVO(Wrapper<JiankongxinxiEntity> wrapper);
   	
   	JiankongxinxiVO selectVO(@Param("ew") Wrapper<JiankongxinxiEntity> wrapper);
   	
   	List<JiankongxinxiView> selectListView(Wrapper<JiankongxinxiEntity> wrapper);
   	
   	JiankongxinxiView selectView(@Param("ew") Wrapper<JiankongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankongxinxiEntity> wrapper);
   	

}

