package com.quxiao.oss.service;

import com.baomidou.mybatisplus.service.IService;
import com.quxiao.common.utils.PageUtils;
import com.quxiao.oss.entity.SysOssEntity;

import java.util.Map;


/**文件上传
 * @author gaoxu
 *
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
