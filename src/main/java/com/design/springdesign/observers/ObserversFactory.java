package com.design.springdesign.observers;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lobster
 */
@Component
public class ObserversFactory {
    @Resource
    private List<AbstractObservers> observersList;

    public void updateState(String id) {
        observersList.forEach(service -> service.updateState(id));
    }
}
