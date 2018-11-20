package com.quxiao.oms.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.quxiao.oms.entity.SysConfigEntity;

import org.apache.ibatis.annotations.Param;


/**系统配置信息
 * @author gaoxu
 *
 */
public interface SysConfigDao extends BaseMapper<SysConfigEntity> {

	/**
	 * 根据key，查询value
	 */
	SysConfigEntity queryByKey(String paramKey);

	/**
	 * 根据key，更新value
	 */
	int updateValueByKey(@Param("paramKey") String paramKey, @Param("paramValue") String paramValue);
	
}
