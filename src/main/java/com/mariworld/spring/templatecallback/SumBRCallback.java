package com.mariworld.spring.templatecallback;

import java.io.BufferedReader;

public class SumBRCallback implements BufferedReaderCallback{
    @Override
    public int doSomethingWithReader(BufferedReader br) throws Exception {
        String content;
        int sum=0;
        while((content=br.readLine())!=null){
            sum+= Integer.parseInt(content);
        }return sum;
    }
}
