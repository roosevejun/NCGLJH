package com.tongtu.ncgl.jh.configurer.shiro;

import com.tongtu.ncgl.jh.beans.sys.Appuser;
import com.tongtu.ncgl.jh.services.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = (String) authenticationToken.getPrincipal();
        String password = new String((char[]) authenticationToken.getCredentials());
        Appuser user = this.userService.loadAppuserByLoginName(userName);
        if (user == null) {
            throw new UnknownAccountException("用户名不存在！");
        }
        if (!password.equals(user.getAppuserPwd())) {
            throw new IncorrectCredentialsException("用户名或密码错误！");
        }

        return new SimpleAuthenticationInfo(user, password, getName());
    }
}
