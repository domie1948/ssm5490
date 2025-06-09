package com.dao;

import com.entity.YingpianleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingpianleixingVO;
import com.entity.view.YingpianleixingView;


/**
 * 影片类型
 * 
 * @author 
 * @email 
 * @date 2021-04-14 23:36:22
 */
public interface YingpianleixingDao extends BaseMapper<YingpianleixingEntity> {
	
	List<YingpianleixingVO> selectListVO(@Param("ew") Wrapper<YingpianleixingEntity> wrapper);
	
	YingpianleixingVO selectVO(@Param("ew") Wrapper<YingpianleixingEntity> wrapper);
	
	List<YingpianleixingView> selectListView(@Param("ew") Wrapper<YingpianleixingEntity> wrapper);

	List<YingpianleixingView> selectListView(Pagination page,@Param("ew") Wrapper<YingpianleixingEntity> wrapper);
	
	YingpianleixingView selectView(@Param("ew") Wrapper<YingpianleixingEntity> wrapper);
	
}
