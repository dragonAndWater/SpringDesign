package com.design.springdesign.template;

import lombok.extern.slf4j.Slf4j;

/**
 * 模板模式 抽象类
 *
 * @author pc
 */
@Slf4j
public abstract class AbstractTemplate {

    /**
     * 模板方法
     *
     * @param str 入参
     */
    protected void execute(String str) {
        init(str);
        stepOne(str);
        stepTwo(str);
        stepThree(str);
        stepFour(str);
        end(str);
    }

    /**
     * 初始化方法
     *
     * @param str 入参
     */
    protected void init(String str) {
        log.info("------模板模式初始化------");
    }

    /**
     * 步骤一
     *
     * @param str 入参
     */
    abstract void stepOne(String str);

    /**
     * 步骤二
     *
     * @param str 入参
     */
    abstract void stepTwo(String str);

    /**
     * 步骤三
     *
     * @param str 入参
     */
    abstract void stepThree(String str);

    /**
     * 步骤四
     *
     * @param str 入参
     */
    abstract void stepFour(String str);

    /**
     * 结束方法
     *
     * @param str 入参
     */
    protected void end(String str) {
        log.info("------模板模式结束------");
    }
}
