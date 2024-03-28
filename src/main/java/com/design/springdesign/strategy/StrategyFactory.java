package com.design.springdesign.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Component
public class StrategyFactory {

    public static final Map<StrategyEnum, AbstractStrategy> STRATEGY_MAP = new ConcurrentHashMap<>();

    @Autowired
    public StrategyFactory(List<AbstractStrategy> strategyList) {
        Map<StrategyEnum, AbstractStrategy> strategyMap = strategyList.stream().collect(Collectors.toMap(AbstractStrategy::type, service -> service));
        STRATEGY_MAP.putAll(strategyMap);
    }

}
