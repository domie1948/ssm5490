package com.dao;

import com.entity.DiscussyingpianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyingpianxinxiVO;
import com.entity.view.DiscussyingpianxinxiView;


/**
 * 影片信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-14 23:36:23
 */
public interface DiscussyingpianxinxiDao extends BaseMapper<DiscussyingpianxinxiEntity> {
	
	List<DiscussyingpianxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyingpianxinxiEntity> wrapper);
	
	DiscussyingpianxinxiVO selectVO(@Param("ew") Wrapper<DiscussyingpianxinxiEntity> wrapper);
	
	List<DiscussyingpianxinxiView> selectListView(@Param("ew") Wrapper<DiscussyingpianxinxiEntity> wrapper);

	List<DiscussyingpianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyingpianxinxiEntity> wrapper);
	
	DiscussyingpianxinxiView selectView(@Param("ew") Wrapper<DiscussyingpianxinxiEntity> wrapper);
	
}
