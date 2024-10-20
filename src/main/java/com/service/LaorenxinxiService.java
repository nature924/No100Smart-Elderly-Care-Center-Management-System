package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaorenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LaorenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LaorenxinxiView;


/**
 * 老人信息
 *
 * @author 
 * @email 
 * @date 2022-09-08 14:49:58
 */
public interface LaorenxinxiService extends IService<LaorenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LaorenxinxiVO> selectListVO(Wrapper<LaorenxinxiEntity> wrapper);
   	
   	LaorenxinxiVO selectVO(@Param("ew") Wrapper<LaorenxinxiEntity> wrapper);
   	
   	List<LaorenxinxiView> selectListView(Wrapper<LaorenxinxiEntity> wrapper);
   	
   	LaorenxinxiView selectView(@Param("ew") Wrapper<LaorenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LaorenxinxiEntity> wrapper);
   	

}

