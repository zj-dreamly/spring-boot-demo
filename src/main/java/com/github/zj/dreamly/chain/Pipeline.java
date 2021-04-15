package com.github.zj.dreamly.chain;

public interface Pipeline {

    Pipeline fireTaskReceived();

    Pipeline fireTaskFiltered();

    Pipeline fireTaskExecuted();

    Pipeline fireAfterCompletion();
}