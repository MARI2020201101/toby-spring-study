package com.mariworld.spring.templatecallback;

import java.io.BufferedReader;

public interface BufferedReaderCallback {
    int doSomethingWithReader(BufferedReader br) throws Exception;
}
