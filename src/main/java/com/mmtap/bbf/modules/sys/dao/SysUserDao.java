package com.mmtap.bbf.modules.sys.dao;

import com.mmtap.bbf.modules.sys.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 系统用户
 *
 * @author mmtap.com
 * @email java_khan@126.com
 * @date 2018-03-15 10:45
 */
@Mapper
public interface SysUserDao extends BaseDao<SysUserEntity> {
	
	/**
	 * 查询用户的所有权限
	 * @param userId  用户ID
	 */
	List<String> queryAllPerms(Long userId);
	
	/**
	 * 查询用户的所有菜单ID
	 */
	List<Long> queryAllMenuId(Long userId);
	
	/**
	 * 根据用户名，查询系统用户
	 */
	SysUserEntity queryByUserName(String username);
	
	/**
	 * 修改密码
	 */
	int updatePassword(Map<String, Object> map);
}
