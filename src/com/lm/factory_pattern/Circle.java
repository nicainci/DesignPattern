package com.lm.factory_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 14:50
 * @Description: 圆形实体类、实现图形接口
 **/
public class Circle implements Shape {
    /**
     * 绘制圆形
     */
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
