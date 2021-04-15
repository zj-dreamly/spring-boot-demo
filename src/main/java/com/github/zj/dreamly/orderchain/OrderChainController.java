package com.github.zj.dreamly.orderchain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderChainController {

    @Resource
    InitPrintChainPattern chainPattern;

    @GetMapping("/order-chain")
    public String orderChain() {
        chainPattern.print(3);
        return "success";
    }

}