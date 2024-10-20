package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FeiyongshoujiaoDao;
import com.entity.FeiyongshoujiaoEntity;
import com.service.FeiyongshoujiaoService;
import com.entity.vo.FeiyongshoujiaoVO;
import com.entity.view.FeiyongshoujiaoView;

@Service("feiyongshoujiaoService")
public class FeiyongshoujiaoServiceImpl extends ServiceImpl<FeiyongshoujiaoDao, FeiyongshoujiaoEntity> implements FeiyongshoujiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeiyongshoujiaoEntity> page = this.selectPage(
                new Query<FeiyongshoujiaoEntity>(params).getPage(),
                new EntityWrapper<FeiyongshoujiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeiyongshoujiaoEntity> wrapper) {
		  Page<FeiyongshoujiaoView> page =new Query<FeiyongshoujiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FeiyongshoujiaoVO> selectListVO(Wrapper<FeiyongshoujiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FeiyongshoujiaoVO selectVO(Wrapper<FeiyongshoujiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FeiyongshoujiaoView> selectListView(Wrapper<FeiyongshoujiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeiyongshoujiaoView selectView(Wrapper<FeiyongshoujiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
