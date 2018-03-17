package com.lm.abstract_factory_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 15:06
 * @Description: 正方形实体类，实现图形接口
 **/
public class Square implements Shape {
    /**
     * 绘制正方形
     */
    @Override
    public void onDraw() {
        System.out.println("绘制正方形");
    }
}
