package com.group12.lawfirm.common;

import java.lang.annotation.*;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoLogs {
    // 操作的模块
    String operation();
    // 操作类型
    LogType type();
}
