package com.quxiao.oms.controller;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.quxiao.oms.entity.SysUserEntity;



/**Controller公共组件
 * @author gaoxu
 *
 */
public abstract class AbstractController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected SysUserEntity getUser() {
		return (SysUserEntity) SecurityUtils.getSubject().getPrincipal();
	}

	protected Long getUserId() {
		return getUser().getUserId();
	}

	protected Long getDeptId() {
		return getUser().getDeptId();
	}
}
