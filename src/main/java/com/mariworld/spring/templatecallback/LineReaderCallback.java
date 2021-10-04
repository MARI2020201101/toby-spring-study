package com.mariworld.spring.templatecallback;

import java.io.BufferedReader;

public interface LineReaderCallback {
    int doSomethingWithCallback(String content, int value) throws Exception;
}
