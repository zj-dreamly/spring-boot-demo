package com.github.zj.dreamly.strategy;

import org.springframework.stereotype.Component;

@Component("one")
public class StrategyOne implements Strategy {
    @Override
    public String doOperation() {
        return "one";
    }
}