package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanhouganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanhouganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanhouganView;


/**
 * 观后感
 *
 * @author 
 * @email 
 * @date 2021-04-14 23:36:23
 */
public interface GuanhouganService extends IService<GuanhouganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanhouganVO> selectListVO(Wrapper<GuanhouganEntity> wrapper);
   	
   	GuanhouganVO selectVO(@Param("ew") Wrapper<GuanhouganEntity> wrapper);
   	
   	List<GuanhouganView> selectListView(Wrapper<GuanhouganEntity> wrapper);
   	
   	GuanhouganView selectView(@Param("ew") Wrapper<GuanhouganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanhouganEntity> wrapper);
   	
}

