package com.mmtap.bbf.modules.user.dao;

import com.mmtap.bbf.modules.sys.dao.BaseDao;
import com.mmtap.bbf.modules.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * 
 * @author czx
 * @email object_czx@163.com
 * @date 2017-10-23 21:23:54
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity> {
    UserEntity queryByMobile(String mobile);
}
