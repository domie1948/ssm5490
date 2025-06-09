package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingpianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingpianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingpianxinxiView;


/**
 * 影片信息
 *
 * @author 
 * @email 
 * @date 2021-04-14 23:36:22
 */
public interface YingpianxinxiService extends IService<YingpianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingpianxinxiVO> selectListVO(Wrapper<YingpianxinxiEntity> wrapper);
   	
   	YingpianxinxiVO selectVO(@Param("ew") Wrapper<YingpianxinxiEntity> wrapper);
   	
   	List<YingpianxinxiView> selectListView(Wrapper<YingpianxinxiEntity> wrapper);
   	
   	YingpianxinxiView selectView(@Param("ew") Wrapper<YingpianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingpianxinxiEntity> wrapper);
   	
}

