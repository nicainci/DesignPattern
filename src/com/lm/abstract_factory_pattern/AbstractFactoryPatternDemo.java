package com.lm.abstract_factory_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 15:35
 * @Description: 抽象工厂模式Demo
 **/
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        //根据需求生成图形工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //图形工厂生产圆形并绘制
        shapeFactory.getShape("CIRCLE").onDraw();
        //图形工厂生产正方形并绘制
        shapeFactory.getShape("SQUARE").onDraw();
        //图形工厂生产矩形并绘制
        shapeFactory.getShape("RECTANGLE").onDraw();

        //根据需求生成颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //颜色工厂生产红色并填充
        colorFactory.getColor("RED").onFill();
        //颜色工厂生产绿色并填充
        colorFactory.getColor("GREEN").onFill();
        //颜色工厂生产蓝色并填充
        colorFactory.getColor("BLUE").onFill();
    }
}
