package com.lm.abstract_factory_pattern;

/**
 * @Author: lm
 * @Date: 2018-03-17 15:10
 * @Description: 绿色实体类，实现颜色接口
 **/
public class Green implements Color{
    /**
     * 填充绿色
     */
    @Override
    public void onFill() {
        System.out.println("填充绿色");
    }
}
