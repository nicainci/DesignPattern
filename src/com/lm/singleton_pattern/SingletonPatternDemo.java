package com.lm.singleton_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 15:49
 * @Description: 单例模式Demo
 **/
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject singleObject = new SingleObject();

        //获取单例对象
        SingleObject singleObject = SingleObject.getInstance();

        //单例对象展示消息
        singleObject.showMessage();
    }
}
