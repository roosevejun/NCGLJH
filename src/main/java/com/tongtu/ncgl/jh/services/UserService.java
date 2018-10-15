package com.tongtu.ncgl.jh.services;

import com.tongtu.ncgl.jh.beans.sys.Appuser;
import com.tongtu.ncgl.jh.repository.sqlserver.AppuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("appUserService")
public class UserService {
    @Autowired
    private AppuserRepository appuserRepository;

    public Boolean checkAppuserLogin(String appuserLoginName, String appuserPwd) {
        Boolean isLogin = appuserRepository.checkAppuserLogin(appuserLoginName, appuserPwd);
        if (isLogin != null && isLogin.booleanValue() == true) {
            return true;
        }
        return false;
    }

    public Appuser loadAppuserByLoginName(String appuserLoginName) {
        return appuserRepository.loadAppuserByLoginName(appuserLoginName);
    }
}
