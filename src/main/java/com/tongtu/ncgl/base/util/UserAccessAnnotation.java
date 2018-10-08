package com.tongtu.ncgl.base.util;

import com.tongtu.ncgl.base.bean.UserCheckEnum;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface UserAccessAnnotation {
    /**
     * 描述
     *
     * @return
     */
    public UserCheckEnum isLogin() default UserCheckEnum.NotLogin;
}
