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


import com.dao.LaorenxinxiDao;
import com.entity.LaorenxinxiEntity;
import com.service.LaorenxinxiService;
import com.entity.vo.LaorenxinxiVO;
import com.entity.view.LaorenxinxiView;

@Service("laorenxinxiService")
public class LaorenxinxiServiceImpl extends ServiceImpl<LaorenxinxiDao, LaorenxinxiEntity> implements LaorenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LaorenxinxiEntity> page = this.selectPage(
                new Query<LaorenxinxiEntity>(params).getPage(),
                new EntityWrapper<LaorenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LaorenxinxiEntity> wrapper) {
		  Page<LaorenxinxiView> page =new Query<LaorenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LaorenxinxiVO> selectListVO(Wrapper<LaorenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LaorenxinxiVO selectVO(Wrapper<LaorenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LaorenxinxiView> selectListView(Wrapper<LaorenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LaorenxinxiView selectView(Wrapper<LaorenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
