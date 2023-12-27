package com.xh.factory;

import com.xh.factory.strategy.PayStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@SuppressWarnings("all")
public class PayFactory {

    @Autowired
    Map<String, PayStrategy> payMap = new ConcurrentHashMap();

    public PayStrategy getPayStrategy(String componentName) {
        PayStrategy payStrategy = payMap.get(componentName);
        if (payStrategy == null) {
            throw new RuntimeException("there is no strategy! ");
        }
        return payStrategy;
    }
}
