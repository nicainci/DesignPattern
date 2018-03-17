package com.lm.abstract_factory_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 15:18
 * @Description: 图形工厂，继承抽象工厂；实现根据需求生产图形。
 **/
public class ShapeFactory extends AbstractFactory {

    /**
     * 图形工厂无法根据需求生产颜色
     *
     * @param colorType 需求
     * @return null
     */
    @Override
    Color getColor(String colorType) {
        return null;
    }

    /**
     * 根据需求生产图形
     *
     * @param shapeType 需求
     * @return 图形实体类
     */
    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
