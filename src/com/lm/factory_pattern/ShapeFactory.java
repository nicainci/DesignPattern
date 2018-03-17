package com.lm.factory_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 14:50
 * @Description: 图形工厂，根据需求生产需要的图形
 **/
public class ShapeFactory {

    /**
     * 根据需求生产需要的图形
     * 但是有缺点，每次增加一个图形时，都需要修改
     *
     * @param shapeType 需求
     * @return 图形实体类
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }

    /**
     * 根据需求生产需要的图形
     *
     * @param clazz 需求
     * @return 图形实体类
     */
    public <T> T getShape(Class<? extends T> clazz) {
        T object = null;
        try {
            object = (T) Class.forName(clazz.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
