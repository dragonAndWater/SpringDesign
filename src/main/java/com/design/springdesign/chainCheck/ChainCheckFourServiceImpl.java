package com.design.springdesign.chainCheck;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * 具体处理器1
 *
 * @author lobster
 */
@Slf4j
@Order(4)
@Service
public class ChainCheckFourServiceImpl extends ChainCheckService {
    private ChainCheckService next;

    @Override
    public void setNext(ChainCheckService next) {
        this.next = next;
    }

    @Override
    public void check(String request) {
        log.info("------执行chainCheckFour------");

        if (null != next) {
            next.check(request);
        }

    }
}