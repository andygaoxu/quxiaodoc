package com.quxiao.job.service;

import com.baomidou.mybatisplus.service.IService;
import com.quxiao.common.utils.PageUtils;
import com.quxiao.job.entity.ScheduleJobLogEntity;

import java.util.Map;


/**定时任务日志
 * @author gaoxu
 *
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
