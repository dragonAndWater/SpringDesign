package com.design.springdesign.chainCheck;

/**
 * @author pc
 */
public abstract class ChainCheckService {
    /**
     * 设置下一个节点
     *
     * @param next 下一个节点
     */
    abstract void setNext(ChainCheckService next);

    /**
     * 检查逻辑
     *
     * @param request 检查逻辑的入参
     */
    public abstract void check(String request);
}