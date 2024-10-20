package com.dao;

import com.entity.FeiyongshoujiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeiyongshoujiaoVO;
import com.entity.view.FeiyongshoujiaoView;


/**
 * 费用收缴
 * 
 * @author 
 * @email 
 * @date 2022-09-08 14:49:58
 */
public interface FeiyongshoujiaoDao extends BaseMapper<FeiyongshoujiaoEntity> {
	
	List<FeiyongshoujiaoVO> selectListVO(@Param("ew") Wrapper<FeiyongshoujiaoEntity> wrapper);
	
	FeiyongshoujiaoVO selectVO(@Param("ew") Wrapper<FeiyongshoujiaoEntity> wrapper);
	
	List<FeiyongshoujiaoView> selectListView(@Param("ew") Wrapper<FeiyongshoujiaoEntity> wrapper);

	List<FeiyongshoujiaoView> selectListView(Pagination page,@Param("ew") Wrapper<FeiyongshoujiaoEntity> wrapper);
	
	FeiyongshoujiaoView selectView(@Param("ew") Wrapper<FeiyongshoujiaoEntity> wrapper);
	

}
