package com.tongtu.ncgl.jh.configurer.shiro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "shiro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShiroProperties {
    // shiro redis缓存时长，默认值 1800 秒
    private int expireIn = 1800;
    // session 超时时间，默认 1800000毫秒
    private long sessionTimeout = 1800000L;
    // rememberMe 有效时长，默认为 86400 秒，即一天
    private int cookieTimeout = 86400;

    private String anonUrl;

    private String loginUrl = "/login";

    private String successUrl = "/index";

    private String logoutUrl = "/logout";

    private String unauthorizedUrl;
}
