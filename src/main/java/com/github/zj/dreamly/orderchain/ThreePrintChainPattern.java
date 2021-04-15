package com.github.zj.dreamly.orderchain;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class ThreePrintChainPattern extends PrintChainPattern {

    private final int order = 3;

    @Override
    public String getMessage() {
        return "three";
    }
}