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


import com.dao.DiscussyingpianxinxiDao;
import com.entity.DiscussyingpianxinxiEntity;
import com.service.DiscussyingpianxinxiService;
import com.entity.vo.DiscussyingpianxinxiVO;
import com.entity.view.DiscussyingpianxinxiView;

@Service("discussyingpianxinxiService")
public class DiscussyingpianxinxiServiceImpl extends ServiceImpl<DiscussyingpianxinxiDao, DiscussyingpianxinxiEntity> implements DiscussyingpianxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyingpianxinxiEntity> page = this.selectPage(
                new Query<DiscussyingpianxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyingpianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyingpianxinxiEntity> wrapper) {
		  Page<DiscussyingpianxinxiView> page =new Query<DiscussyingpianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyingpianxinxiVO> selectListVO(Wrapper<DiscussyingpianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyingpianxinxiVO selectVO(Wrapper<DiscussyingpianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyingpianxinxiView> selectListView(Wrapper<DiscussyingpianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyingpianxinxiView selectView(Wrapper<DiscussyingpianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
