package com.quxiao.job.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.quxiao.job.entity.ScheduleJobEntity;

import java.util.Map;

/**定时任务
 * @author gaoxu
 *
 */
public interface ScheduleJobDao extends BaseMapper<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
