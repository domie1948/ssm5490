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


import com.dao.YingpianxinxiDao;
import com.entity.YingpianxinxiEntity;
import com.service.YingpianxinxiService;
import com.entity.vo.YingpianxinxiVO;
import com.entity.view.YingpianxinxiView;

@Service("yingpianxinxiService")
public class YingpianxinxiServiceImpl extends ServiceImpl<YingpianxinxiDao, YingpianxinxiEntity> implements YingpianxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingpianxinxiEntity> page = this.selectPage(
                new Query<YingpianxinxiEntity>(params).getPage(),
                new EntityWrapper<YingpianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingpianxinxiEntity> wrapper) {
		  Page<YingpianxinxiView> page =new Query<YingpianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingpianxinxiVO> selectListVO(Wrapper<YingpianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingpianxinxiVO selectVO(Wrapper<YingpianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingpianxinxiView> selectListView(Wrapper<YingpianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingpianxinxiView selectView(Wrapper<YingpianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
