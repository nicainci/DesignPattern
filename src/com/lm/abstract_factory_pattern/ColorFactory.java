package com.lm.abstract_factory_pattern;

import sun.security.provider.SHA;

/**
 * @Author: lm
 * @Date: 2018-03-17 15:21
 * @Description: 颜色工厂，继承抽象工厂；实现根据需求生产颜色。
 **/
public class ColorFactory extends AbstractFactory {
    /**
     * 根据需求生产颜色
     *
     * @param colorType 需求
     * @return 颜色实体类
     */
    @Override
    Color getColor(String colorType) {
        if (colorType == null) return null;
        if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        }
        return null;
    }

    /**
     * 颜色工厂无法根据需求生产图形
     *
     * @param shapeType 需求
     * @return null
     */
    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}
