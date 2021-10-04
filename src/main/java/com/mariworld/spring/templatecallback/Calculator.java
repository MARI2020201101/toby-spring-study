package com.mariworld.spring.templatecallback;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {

    public int calculate(String filePath, BufferedReaderCallback callback) {
        int sum = 0;
        FileReader fr =null;
        BufferedReader br =null;

        try {
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);

            sum = callback.doSomethingWithReader(br);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sum;
    }
    public int calcSum(String filePath, BufferedReader br){
        BufferedReaderCallback callback = new BufferedReaderCallback() {
            @Override
            public int doSomethingWithReader(BufferedReader br) throws Exception {
                String content;
                int sum=0;
                while((content=br.readLine())!=null){
                    sum+= Integer.parseInt(content);
                }return sum;
            }
        };
        return calculate(filePath, callback);
    }
}
