package com.quxiao.oms.service;


import com.baomidou.mybatisplus.service.IService;
import com.quxiao.common.utils.PageUtils;
import com.quxiao.oms.entity.SysLogEntity;

import java.util.Map;

/**系统日志
 * @author gaoxu
 *
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
