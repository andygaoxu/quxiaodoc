package com.quxiao.oms.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.quxiao.oms.entity.SysDeptEntity;

import java.util.List;


/**部门管理
 * @author gaoxu
 *
 */
public interface SysDeptDao extends BaseMapper<SysDeptEntity> {

    /**
     * 查询子部门ID列表
     * @param parentId  上级部门ID
     */
    List<Long> queryDetpIdList(Long parentId);

}
