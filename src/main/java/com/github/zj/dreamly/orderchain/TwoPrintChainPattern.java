package com.github.zj.dreamly.orderchain;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class TwoPrintChainPattern extends PrintChainPattern {

    private final int order = 2;

    @Override
    public String getMessage() {
        return "two";
    }
}