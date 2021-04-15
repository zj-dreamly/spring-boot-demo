package com.github.zj.dreamly.orderchain;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Configuration
public class InitPrintChainPattern {

    @Resource
    private List<PrintChainPattern> printChainPatterns;

    @PostConstruct
    private void initPrintChainPattern() {
        printChainPatterns.sort(AnnotationAwareOrderComparator.INSTANCE);

        int size = printChainPatterns.size();
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                printChainPatterns.get(i).setNext(null);
            } else {
                printChainPatterns.get(i).setNext(printChainPatterns.get(i + 1));
            }
        }
    }

    public void print(int index) {
        PrintChainPattern chain = printChainPatterns.get(index - 1);
        chain.print();
    }
}