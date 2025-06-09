package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyingpianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyingpianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyingpianxinxiView;


/**
 * 影片信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-14 23:36:23
 */
public interface DiscussyingpianxinxiService extends IService<DiscussyingpianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyingpianxinxiVO> selectListVO(Wrapper<DiscussyingpianxinxiEntity> wrapper);
   	
   	DiscussyingpianxinxiVO selectVO(@Param("ew") Wrapper<DiscussyingpianxinxiEntity> wrapper);
   	
   	List<DiscussyingpianxinxiView> selectListView(Wrapper<DiscussyingpianxinxiEntity> wrapper);
   	
   	DiscussyingpianxinxiView selectView(@Param("ew") Wrapper<DiscussyingpianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyingpianxinxiEntity> wrapper);
   	
}

