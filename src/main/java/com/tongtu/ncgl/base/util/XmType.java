package com.tongtu.ncgl.base.util;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,
        ElementType.METHOD,
        ElementType.TYPE,
        ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface XmType {
    Type value();
    public static enum Type {
        Road,
        Station,
        Bridge,
        Ferry,
        Protect
    }
}
