package com.lm.singleton_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 15:44
 * @Description: 单例实体类
 **/
public class SingleObject {

    //实例化一个单例实体类对象
    private static SingleObject instance = new SingleObject();

    /**
     * 私有化构造函数，使得该类无法在外界被实例化
     */
    private SingleObject() {
    }

    /**
     * 唯一可以获取单例实体类对象的方法
     *
     * @return 单例实体类对象
     */
    public static SingleObject getInstance() {
        return instance;
    }

    /**
     * 展示消息
     */
    public void showMessage() {
        System.out.println("Hello World!");
    }
}
