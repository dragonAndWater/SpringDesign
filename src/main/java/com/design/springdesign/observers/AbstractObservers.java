package com.design.springdesign.observers;

/**
 * 观察者模式
 *
 * @author lobster
 */

public abstract class AbstractObservers {

    /**
     * 根据主键id更新状态
     *
     * @param id 主键id
     */
    abstract void updateState(String id);

}
