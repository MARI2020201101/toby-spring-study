package com.mariworld.spring.templatecallback;

public interface LineCallback<T> {
    T doSomething(String content ,T value);
}
