package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingpiandingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingpiandingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingpiandingdanView;


/**
 * 影片订单
 *
 * @author 
 * @email 
 * @date 2021-04-14 23:36:23
 */
public interface YingpiandingdanService extends IService<YingpiandingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingpiandingdanVO> selectListVO(Wrapper<YingpiandingdanEntity> wrapper);
   	
   	YingpiandingdanVO selectVO(@Param("ew") Wrapper<YingpiandingdanEntity> wrapper);
   	
   	List<YingpiandingdanView> selectListView(Wrapper<YingpiandingdanEntity> wrapper);
   	
   	YingpiandingdanView selectView(@Param("ew") Wrapper<YingpiandingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingpiandingdanEntity> wrapper);
   	
}

