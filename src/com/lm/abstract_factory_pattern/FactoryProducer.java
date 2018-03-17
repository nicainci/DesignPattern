package com.lm.abstract_factory_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 15:32
 * @Description: 工厂生成器实体类，用于生产抽象工厂的实体类（颜色工厂、图形工厂）
 **/
public class FactoryProducer {
    /**
     * 更新需求生成不同的工厂
     *
     * @param factoryType 需求
     * @return 抽象工厂实体类
     */
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) return null;
        if (factoryType.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factoryType.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
