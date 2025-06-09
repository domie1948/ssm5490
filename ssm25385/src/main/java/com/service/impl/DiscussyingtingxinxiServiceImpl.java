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


import com.dao.DiscussyingtingxinxiDao;
import com.entity.DiscussyingtingxinxiEntity;
import com.service.DiscussyingtingxinxiService;
import com.entity.vo.DiscussyingtingxinxiVO;
import com.entity.view.DiscussyingtingxinxiView;

@Service("discussyingtingxinxiService")
public class DiscussyingtingxinxiServiceImpl extends ServiceImpl<DiscussyingtingxinxiDao, DiscussyingtingxinxiEntity> implements DiscussyingtingxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyingtingxinxiEntity> page = this.selectPage(
                new Query<DiscussyingtingxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyingtingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyingtingxinxiEntity> wrapper) {
		  Page<DiscussyingtingxinxiView> page =new Query<DiscussyingtingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyingtingxinxiVO> selectListVO(Wrapper<DiscussyingtingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyingtingxinxiVO selectVO(Wrapper<DiscussyingtingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyingtingxinxiView> selectListView(Wrapper<DiscussyingtingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyingtingxinxiView selectView(Wrapper<DiscussyingtingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
