package com.mmtap.bbf.datasources;

import com.mmtap.bbf.datasources.annotation.DataSource;
import com.mmtap.bbf.modules.user.entity.UserEntity;
import com.mmtap.bbf.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试
 * @author czx
 * @email object_czx@163.com
 * @date 2017/9/16 23:10
 */
@Service
public class DataSourceTestService {
    @Autowired
    private UserService userService;

    public UserEntity queryObject(Long userId){
        return userService.queryObject(userId);
    }

    @DataSource(name = DataSourceNames.SECOND)
    public UserEntity queryObject2(Long userId){
        return userService.queryObject(userId);
    }
}
