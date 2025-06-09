package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyingtingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyingtingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyingtingxinxiView;


/**
 * 影厅信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-14 23:36:23
 */
public interface DiscussyingtingxinxiService extends IService<DiscussyingtingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyingtingxinxiVO> selectListVO(Wrapper<DiscussyingtingxinxiEntity> wrapper);
   	
   	DiscussyingtingxinxiVO selectVO(@Param("ew") Wrapper<DiscussyingtingxinxiEntity> wrapper);
   	
   	List<DiscussyingtingxinxiView> selectListView(Wrapper<DiscussyingtingxinxiEntity> wrapper);
   	
   	DiscussyingtingxinxiView selectView(@Param("ew") Wrapper<DiscussyingtingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyingtingxinxiEntity> wrapper);
   	
}

