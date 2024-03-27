package com.design.springdesign.observers;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 观察者模式
 *
 * @author lobster
 */
@Slf4j
@RestController
@RequestMapping("observer")
public class ObserverController {

    @Resource
    ObserversFactory observersFactory;
    @GetMapping("demo")
    public void observerDemo(){
        observersFactory.updateState("1234");
    }
}
