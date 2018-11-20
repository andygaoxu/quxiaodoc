package com.quxiao.oms.service;

import com.baomidou.mybatisplus.service.IService;
import com.quxiao.common.utils.PageUtils;
import com.quxiao.oms.entity.SysDictEntity;

import java.util.Map;

/**数据字典
 * @author gaoxu
 *
 */
public interface SysDictService extends IService<SysDictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

