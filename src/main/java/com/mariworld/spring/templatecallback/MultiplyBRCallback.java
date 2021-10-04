package com.mariworld.spring.templatecallback;

import java.io.BufferedReader;

public class MultiplyBRCallback implements BufferedReaderCallback{
    @Override
    public int doSomethingWithReader(BufferedReader br) throws Exception {
        String content;
        int multiply=1;
        while((content=br.readLine())!=null){
            multiply*= Integer.parseInt(content);
        }return multiply;
    }
}
