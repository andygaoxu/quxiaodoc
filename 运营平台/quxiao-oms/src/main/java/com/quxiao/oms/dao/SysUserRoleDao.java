package com.quxiao.oms.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.quxiao.oms.entity.SysUserRoleEntity;

import java.util.List;

/**
 * @author gaoxu
 *
 */
public interface SysUserRoleDao extends BaseMapper<SysUserRoleEntity> {
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
