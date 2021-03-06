package com.mmtap.bbf.modules.app.controller;
import com.mmtap.bbf.common.utils.R;
import com.mmtap.bbf.modules.app.annotation.AuthIgnore;
import com.mmtap.bbf.modules.app.annotation.Login;
import com.mmtap.bbf.modules.app.annotation.LoginUser;
import com.mmtap.bbf.modules.user.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * APP测试接口
 * @author mmtap.com
 * @email java_khan@126.com
 * @date 2018-03-15 10:45
 */
@RestController
@RequestMapping("/app")
public class ApiTestController {

    /**
     * 获取用户信息
     */
    @Login
    @GetMapping("userInfo")
    public R userInfo(@LoginUser UserEntity user){
        return R.ok().put("user", user);
    }

    /**
     * 获取用户ID
     */
    @Login
    @GetMapping("userId")
    public R userInfo(@RequestAttribute("userId") Integer userId){
        return R.ok().put("userId", userId);
    }

    /**
     * 忽略Token验证测试
     */
    @AuthIgnore
    @GetMapping("notToken")
    public R notToken(){
        return R.ok().put("msg", "无需token也能访问。。。");
    }

}
