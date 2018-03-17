package com.lm.abstract_factory_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 15:13
 * @Description: 抽象工厂
 **/
public abstract class AbstractFactory {
    /**
     * 根据需求生产颜色
     *
     * @param colorType 需求
     * @return 颜色实体类
     */
    abstract Color getColor(String colorType);

    /**
     * 根据需求生产图形
     *
     * @param shapeType 需求
     * @return 图形实体类
     */
    abstract Shape getShape(String shapeType);
}
