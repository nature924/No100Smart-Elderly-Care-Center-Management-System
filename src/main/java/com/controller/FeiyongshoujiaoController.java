package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FeiyongshoujiaoEntity;
import com.entity.view.FeiyongshoujiaoView;

import com.service.FeiyongshoujiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 费用收缴
 * 后端接口
 * @author 
 * @email 
 * @date 2022-09-08 14:49:58
 */
@RestController
@RequestMapping("/feiyongshoujiao")
public class FeiyongshoujiaoController {
    @Autowired
    private FeiyongshoujiaoService feiyongshoujiaoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FeiyongshoujiaoEntity feiyongshoujiao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laorenxinxi")) {
			feiyongshoujiao.setLaorenxingming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FeiyongshoujiaoEntity> ew = new EntityWrapper<FeiyongshoujiaoEntity>();

		PageUtils page = feiyongshoujiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, feiyongshoujiao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FeiyongshoujiaoEntity feiyongshoujiao, 
		HttpServletRequest request){
        EntityWrapper<FeiyongshoujiaoEntity> ew = new EntityWrapper<FeiyongshoujiaoEntity>();

		PageUtils page = feiyongshoujiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, feiyongshoujiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FeiyongshoujiaoEntity feiyongshoujiao){
       	EntityWrapper<FeiyongshoujiaoEntity> ew = new EntityWrapper<FeiyongshoujiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( feiyongshoujiao, "feiyongshoujiao")); 
        return R.ok().put("data", feiyongshoujiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FeiyongshoujiaoEntity feiyongshoujiao){
        EntityWrapper< FeiyongshoujiaoEntity> ew = new EntityWrapper< FeiyongshoujiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( feiyongshoujiao, "feiyongshoujiao")); 
		FeiyongshoujiaoView feiyongshoujiaoView =  feiyongshoujiaoService.selectView(ew);
		return R.ok("查询费用收缴成功").put("data", feiyongshoujiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FeiyongshoujiaoEntity feiyongshoujiao = feiyongshoujiaoService.selectById(id);
        return R.ok().put("data", feiyongshoujiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FeiyongshoujiaoEntity feiyongshoujiao = feiyongshoujiaoService.selectById(id);
        return R.ok().put("data", feiyongshoujiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FeiyongshoujiaoEntity feiyongshoujiao, HttpServletRequest request){
    	feiyongshoujiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(feiyongshoujiao);
        feiyongshoujiaoService.insert(feiyongshoujiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FeiyongshoujiaoEntity feiyongshoujiao, HttpServletRequest request){
    	feiyongshoujiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(feiyongshoujiao);
        feiyongshoujiaoService.insert(feiyongshoujiao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FeiyongshoujiaoEntity feiyongshoujiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(feiyongshoujiao);
        feiyongshoujiaoService.updateById(feiyongshoujiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        feiyongshoujiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FeiyongshoujiaoEntity> wrapper = new EntityWrapper<FeiyongshoujiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laorenxinxi")) {
			wrapper.eq("laorenxingming", (String)request.getSession().getAttribute("username"));
		}

		int count = feiyongshoujiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	








}
