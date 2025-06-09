package com.dao;

import com.entity.GuanhouganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanhouganVO;
import com.entity.view.GuanhouganView;


/**
 * 观后感
 * 
 * @author 
 * @email 
 * @date 2021-04-14 23:36:23
 */
public interface GuanhouganDao extends BaseMapper<GuanhouganEntity> {
	
	List<GuanhouganVO> selectListVO(@Param("ew") Wrapper<GuanhouganEntity> wrapper);
	
	GuanhouganVO selectVO(@Param("ew") Wrapper<GuanhouganEntity> wrapper);
	
	List<GuanhouganView> selectListView(@Param("ew") Wrapper<GuanhouganEntity> wrapper);

	List<GuanhouganView> selectListView(Pagination page,@Param("ew") Wrapper<GuanhouganEntity> wrapper);
	
	GuanhouganView selectView(@Param("ew") Wrapper<GuanhouganEntity> wrapper);
	
}
