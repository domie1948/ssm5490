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


import com.dao.GuanhouganDao;
import com.entity.GuanhouganEntity;
import com.service.GuanhouganService;
import com.entity.vo.GuanhouganVO;
import com.entity.view.GuanhouganView;

@Service("guanhouganService")
public class GuanhouganServiceImpl extends ServiceImpl<GuanhouganDao, GuanhouganEntity> implements GuanhouganService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanhouganEntity> page = this.selectPage(
                new Query<GuanhouganEntity>(params).getPage(),
                new EntityWrapper<GuanhouganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanhouganEntity> wrapper) {
		  Page<GuanhouganView> page =new Query<GuanhouganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanhouganVO> selectListVO(Wrapper<GuanhouganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanhouganVO selectVO(Wrapper<GuanhouganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanhouganView> selectListView(Wrapper<GuanhouganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanhouganView selectView(Wrapper<GuanhouganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
