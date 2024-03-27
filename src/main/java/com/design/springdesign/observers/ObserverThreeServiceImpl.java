package com.design.springdesign.observers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * 观察者实现类
 *
 * @author pc
 */
@Order(3)
@Slf4j
@Service
public class ObserverThreeServiceImpl extends AbstractObservers {
    @Override
    void updateState(String id) {
        log.info("------ObserverThree------");
    }
}
