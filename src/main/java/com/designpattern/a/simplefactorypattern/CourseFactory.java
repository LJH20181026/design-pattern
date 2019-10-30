package com.designpattern.a.simplefactorypattern;

import com.designpattern.course.ICourse;

/**
 * 简单工厂模式：不属于23种设计模式
 */
public class CourseFactory {

    public ICourse create(String courseName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (null != courseName && !"".equals(courseName))
            return (ICourse) Class.forName(courseName).newInstance();
        return null;
    }
    //反射
    public static ICourse createByClazz(Class<? extends ICourse> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
