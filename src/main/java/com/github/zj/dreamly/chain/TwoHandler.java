package com.github.zj.dreamly.chain;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class TwoHandler implements Handler {

    public static final int ORDER = 2;

    @Override
    public void filterTask(HandlerContext ctx, Task task) {
        System.out.println("apply 2 filter");
        ctx.fireTaskFiltered(task);
    }
}