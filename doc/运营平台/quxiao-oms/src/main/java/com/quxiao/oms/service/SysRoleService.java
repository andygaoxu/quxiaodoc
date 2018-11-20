package com.quxiao.oms.service;


import com.baomidou.mybatisplus.service.IService;
import com.quxiao.common.utils.PageUtils;
import com.quxiao.oms.entity.SysRoleEntity;

import java.util.Map;


/**角色
 * @author gaoxu
 *
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void save(SysRoleEntity role);

	void update(SysRoleEntity role);
	
	void deleteBatch(Long[] roleIds);

}
