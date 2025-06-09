package com.dao;

import com.entity.YingpianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingpianxinxiVO;
import com.entity.view.YingpianxinxiView;


/**
 * 影片信息
 * 
 * @author 
 * @email 
 * @date 2021-04-14 23:36:22
 */
public interface YingpianxinxiDao extends BaseMapper<YingpianxinxiEntity> {
	
	List<YingpianxinxiVO> selectListVO(@Param("ew") Wrapper<YingpianxinxiEntity> wrapper);
	
	YingpianxinxiVO selectVO(@Param("ew") Wrapper<YingpianxinxiEntity> wrapper);
	
	List<YingpianxinxiView> selectListView(@Param("ew") Wrapper<YingpianxinxiEntity> wrapper);

	List<YingpianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YingpianxinxiEntity> wrapper);
	
	YingpianxinxiView selectView(@Param("ew") Wrapper<YingpianxinxiEntity> wrapper);
	
}
