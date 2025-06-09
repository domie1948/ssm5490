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


import com.dao.YingpiandingdanDao;
import com.entity.YingpiandingdanEntity;
import com.service.YingpiandingdanService;
import com.entity.vo.YingpiandingdanVO;
import com.entity.view.YingpiandingdanView;

@Service("yingpiandingdanService")
public class YingpiandingdanServiceImpl extends ServiceImpl<YingpiandingdanDao, YingpiandingdanEntity> implements YingpiandingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingpiandingdanEntity> page = this.selectPage(
                new Query<YingpiandingdanEntity>(params).getPage(),
                new EntityWrapper<YingpiandingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingpiandingdanEntity> wrapper) {
		  Page<YingpiandingdanView> page =new Query<YingpiandingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingpiandingdanVO> selectListVO(Wrapper<YingpiandingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingpiandingdanVO selectVO(Wrapper<YingpiandingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingpiandingdanView> selectListView(Wrapper<YingpiandingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingpiandingdanView selectView(Wrapper<YingpiandingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
