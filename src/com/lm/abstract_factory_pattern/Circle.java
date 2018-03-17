package com.lm.abstract_factory_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 15:05
 * @Description: 圆形实体类，实现图形接口
 **/
public class Circle implements Shape {
    /**
     * 绘制圆形
     */
    @Override
    public void onDraw() {
        System.out.println("绘制圆形");
    }
}
