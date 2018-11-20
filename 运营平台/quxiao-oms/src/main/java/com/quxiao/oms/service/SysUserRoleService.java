package com.quxiao.oms.service;

import com.baomidou.mybatisplus.service.IService;
import com.quxiao.oms.entity.SysUserRoleEntity;

import java.util.List;

/**
 * @author gaoxu
 *
 */
public interface SysUserRoleService extends IService<SysUserRoleEntity> {
	
	void saveOrUpdate(Long userId, List<Long> roleIdList);
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
