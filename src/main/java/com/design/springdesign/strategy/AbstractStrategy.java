package com.design.springdesign.strategy;

public abstract class AbstractStrategy {

    /**
     * 每个实现类对应一个美剧
     */
    abstract StrategyEnum type();

    /**
     * 处理请求
     *
     * @param str 入参
     */
    abstract void dealMsg(String str);

}
