package com.dao;

import com.entity.DiscussyingtingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyingtingxinxiVO;
import com.entity.view.DiscussyingtingxinxiView;


/**
 * 影厅信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-14 23:36:23
 */
public interface DiscussyingtingxinxiDao extends BaseMapper<DiscussyingtingxinxiEntity> {
	
	List<DiscussyingtingxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyingtingxinxiEntity> wrapper);
	
	DiscussyingtingxinxiVO selectVO(@Param("ew") Wrapper<DiscussyingtingxinxiEntity> wrapper);
	
	List<DiscussyingtingxinxiView> selectListView(@Param("ew") Wrapper<DiscussyingtingxinxiEntity> wrapper);

	List<DiscussyingtingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyingtingxinxiEntity> wrapper);
	
	DiscussyingtingxinxiView selectView(@Param("ew") Wrapper<DiscussyingtingxinxiEntity> wrapper);
	
}
