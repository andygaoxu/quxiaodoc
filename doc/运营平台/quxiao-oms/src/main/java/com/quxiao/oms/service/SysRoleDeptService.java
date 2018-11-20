package com.quxiao.oms.service;

import com.baomidou.mybatisplus.service.IService;
import com.quxiao.oms.entity.SysRoleDeptEntity;

import java.util.List;

/**角色与部门对应关系
 * @author gaoxu
 *
 */
public interface SysRoleDeptService extends IService<SysRoleDeptEntity> {
	
	void saveOrUpdate(Long roleId, List<Long> deptIdList);
	
	/**
	 * 根据角色ID，获取部门ID列表
	 */
	List<Long> queryDeptIdList(Long[] roleIds) ;

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
