package com.design.springdesign.chainCheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author pc
 */
@Component
public class ChainCheckFactory {
    private volatile ChainCheckService initNode = null;

    /**
     * 启动的时候按照order顺序加载chainCheck节点
     *
     * @param chainCheckServices check节点
     */
    @Autowired
    public ChainCheckFactory(List<ChainCheckService> chainCheckServices) {
        initNode = getNode(chainCheckServices, 0);
    }

    /**
     * 递归组装责任链
     *
     * @param chainCheckServices check节点
     * @param index              下标
     * @return 返回当前节点，并给当前节点setNextNode
     */
    private ChainCheckService getNode(List<ChainCheckService> chainCheckServices, Integer index) {
        if (index == chainCheckServices.size() - 1) {
            return chainCheckServices.get(index);
        }
        ChainCheckService currentNode = chainCheckServices.get(index);
        currentNode.setNext(getNode(chainCheckServices, index + 1));
        return currentNode;
    }

    /**
     * 单例模式
     *
     * @return 返回第一个节点
     */
    public ChainCheckService getInitNode() {
        return initNode;
    }
}
