package com.lm.factory_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 14:50
 * @Description: 工厂模式Demo
 **/
public class FactoryPatternDemo {

    public static void main(String[] args) {
        //实例化一个工厂对象
        ShapeFactory shapeFactory = new ShapeFactory();

        //工厂根据需求生产一个圆形
        Shape circle = shapeFactory.getShape(Circle.class);
        //圆形进行绘制
        circle.draw();

        //工厂根据需求生产一个正方形
        Shape square = shapeFactory.getShape(Square.class);
        //正方形进行绘制
        square.draw();

        //工厂根据需求生产一个矩形
        Shape rectangle = shapeFactory.getShape(Rectangle.class);
        //矩形进行绘制
        rectangle.draw();
    }

}
