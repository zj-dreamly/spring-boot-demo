package com.github.zj.dreamly.chain;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ChainController {

    @Resource
    private ApplicationContext context;

    @GetMapping("/chain")
    public String chain() {
        // request一般是通过外部调用获取
        Request request = new Request();
        Pipeline pipeline = newPipeline(request);
        try {
            pipeline.fireTaskReceived();
            pipeline.fireTaskFiltered();
            pipeline.fireTaskExecuted();
            return "success";
        } finally {
            pipeline.fireAfterCompletion();
        }
    }

    private Pipeline newPipeline(Request request) {
        return context.getBean(DefaultPipeline.class, request);
    }
}