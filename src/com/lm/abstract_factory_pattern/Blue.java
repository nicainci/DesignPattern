package com.lm.abstract_factory_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 15:11
 * @Description: 蓝色实体类，实现颜色接口
 **/
public class Blue implements Color {
    /**
     * 填充蓝色
     */
    @Override
    public void onFill() {
        System.out.println("填充蓝色");
    }
}
