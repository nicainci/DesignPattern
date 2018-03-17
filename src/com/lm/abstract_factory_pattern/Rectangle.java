package com.lm.abstract_factory_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 15:07
 * @Description: 矩形实体类，实现图形接口
 **/
public class Rectangle implements Shape {
    /**
     * 绘制矩形
     */
    @Override
    public void onDraw() {
        System.out.println("绘制矩形");
    }
}
