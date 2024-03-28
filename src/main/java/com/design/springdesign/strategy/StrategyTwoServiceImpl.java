package com.design.springdesign.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StrategyTwoServiceImpl extends AbstractStrategy {
    @Override
    StrategyEnum type() {
        return StrategyEnum.TWO;
    }

    @Override
    void dealMsg(String str) {
        log.info("------StrategyEnum.TWO------");
    }
}
