package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingpianleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingpianleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingpianleixingView;


/**
 * 影片类型
 *
 * @author 
 * @email 
 * @date 2021-04-14 23:36:22
 */
public interface YingpianleixingService extends IService<YingpianleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingpianleixingVO> selectListVO(Wrapper<YingpianleixingEntity> wrapper);
   	
   	YingpianleixingVO selectVO(@Param("ew") Wrapper<YingpianleixingEntity> wrapper);
   	
   	List<YingpianleixingView> selectListView(Wrapper<YingpianleixingEntity> wrapper);
   	
   	YingpianleixingView selectView(@Param("ew") Wrapper<YingpianleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingpianleixingEntity> wrapper);
   	
}

