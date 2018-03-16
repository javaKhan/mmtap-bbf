package com.mmtap.bbf.modules.sys.service;

import com.mmtap.bbf.modules.sys.entity.SysUserEntity;
import com.mmtap.bbf.modules.sys.entity.SysUserTokenEntity;

import java.util.Set;

/**
 * shiro相关接口
 * @author mmtap.com
 * @email java_khan@126.com
 * @date 2018-03-15 10:45
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    SysUserTokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     * @param userId
     */
    SysUserEntity queryUser(Long userId);
}
