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


import com.dao.YingpianleixingDao;
import com.entity.YingpianleixingEntity;
import com.service.YingpianleixingService;
import com.entity.vo.YingpianleixingVO;
import com.entity.view.YingpianleixingView;

@Service("yingpianleixingService")
public class YingpianleixingServiceImpl extends ServiceImpl<YingpianleixingDao, YingpianleixingEntity> implements YingpianleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingpianleixingEntity> page = this.selectPage(
                new Query<YingpianleixingEntity>(params).getPage(),
                new EntityWrapper<YingpianleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingpianleixingEntity> wrapper) {
		  Page<YingpianleixingView> page =new Query<YingpianleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingpianleixingVO> selectListVO(Wrapper<YingpianleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingpianleixingVO selectVO(Wrapper<YingpianleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingpianleixingView> selectListView(Wrapper<YingpianleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingpianleixingView selectView(Wrapper<YingpianleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
