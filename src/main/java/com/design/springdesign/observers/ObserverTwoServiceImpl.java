package com.design.springdesign.observers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * 观察者实现类
 *
 * @author pc
 */
@Order(2)
@Slf4j
@Service
public class ObserverTwoServiceImpl extends AbstractObservers {
    @Override
    void updateState(String id) {
        log.info("------ObserverTwo------");
    }
}
