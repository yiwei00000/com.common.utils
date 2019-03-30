package com.common.beanutils;

import java.lang.reflect.Field;

/*
 *Created by yiwei 2019-03-30
 */
public class BeanCopy {
    /**
     * bean属性复制
     * @param source
     * @param dest
     * @throws IllegalAccessException
     */
    public static void copy(Object source,Object dest) throws IllegalAccessException {
        Field[] fields = source.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Class<?> type = field.getType();
            Object fieldValue = field.get(source);
            if (fieldValue != null) {
                field.set(dest, type.cast(field.get(source)));
            }
        }
    }
}
