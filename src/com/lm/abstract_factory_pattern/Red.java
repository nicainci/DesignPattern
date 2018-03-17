package com.lm.abstract_factory_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 15:09
 * @Description: 红色实体类，实现颜色接口
 **/
public class Red implements Color {
    /**
     * 填充红色
     */
    @Override
    public void onFill() {
        System.out.println("填充红色");
    }
}
