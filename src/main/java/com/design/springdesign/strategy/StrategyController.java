package com.design.springdesign.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("strategy")
public class StrategyController {


    @PostMapping(value = "demo", name = "策略模式-请求方式为post,json")
    public void demo(@RequestBody String string) {
        //调用strategyOne实现类
        StrategyFactory.STRATEGY_MAP.get(StrategyEnum.ONE).dealMsg(string);
        //调用strategyTwo实现类
        StrategyFactory.STRATEGY_MAP.get(StrategyEnum.TWO).dealMsg(string);
        //调用strategyThree实现类
        StrategyFactory.STRATEGY_MAP.get(StrategyEnum.THREE).dealMsg(string);
    }

}
