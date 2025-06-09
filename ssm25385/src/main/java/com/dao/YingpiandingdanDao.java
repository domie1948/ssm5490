package com.dao;

import com.entity.YingpiandingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingpiandingdanVO;
import com.entity.view.YingpiandingdanView;


/**
 * 影片订单
 * 
 * @author 
 * @email 
 * @date 2021-04-14 23:36:23
 */
public interface YingpiandingdanDao extends BaseMapper<YingpiandingdanEntity> {
	
	List<YingpiandingdanVO> selectListVO(@Param("ew") Wrapper<YingpiandingdanEntity> wrapper);
	
	YingpiandingdanVO selectVO(@Param("ew") Wrapper<YingpiandingdanEntity> wrapper);
	
	List<YingpiandingdanView> selectListView(@Param("ew") Wrapper<YingpiandingdanEntity> wrapper);

	List<YingpiandingdanView> selectListView(Pagination page,@Param("ew") Wrapper<YingpiandingdanEntity> wrapper);
	
	YingpiandingdanView selectView(@Param("ew") Wrapper<YingpiandingdanEntity> wrapper);
	
}
