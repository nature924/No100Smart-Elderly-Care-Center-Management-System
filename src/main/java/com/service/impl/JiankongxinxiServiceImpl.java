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


import com.dao.JiankongxinxiDao;
import com.entity.JiankongxinxiEntity;
import com.service.JiankongxinxiService;
import com.entity.vo.JiankongxinxiVO;
import com.entity.view.JiankongxinxiView;

@Service("jiankongxinxiService")
public class JiankongxinxiServiceImpl extends ServiceImpl<JiankongxinxiDao, JiankongxinxiEntity> implements JiankongxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankongxinxiEntity> page = this.selectPage(
                new Query<JiankongxinxiEntity>(params).getPage(),
                new EntityWrapper<JiankongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankongxinxiEntity> wrapper) {
		  Page<JiankongxinxiView> page =new Query<JiankongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankongxinxiVO> selectListVO(Wrapper<JiankongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankongxinxiVO selectVO(Wrapper<JiankongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankongxinxiView> selectListView(Wrapper<JiankongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankongxinxiView selectView(Wrapper<JiankongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
