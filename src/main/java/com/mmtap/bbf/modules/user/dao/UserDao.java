package com.mmtap.bbf.modules.user.dao;

import com.mmtap.bbf.modules.sys.dao.BaseDao;
import com.mmtap.bbf.modules.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author mmtap.com
 * @email java_khan@126.com
 * @date 2018-03-15 10:45
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity> {
    UserEntity queryByMobile(String mobile);
}
