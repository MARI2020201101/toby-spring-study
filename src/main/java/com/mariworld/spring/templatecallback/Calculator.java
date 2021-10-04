package com.mariworld.spring.templatecallback;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {

    public <T> T genericCalculate(String filePath, LineCallback<T> callback, T value){
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);
            String content;
            while ((content = br.readLine()) != null) {
                value = callback.doSomething(content, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return value;
    }

    public String concat(String filePath){
       LineCallback<String> callback = new LineCallback<String>() {
           @Override
           public String doSomething(String content, String value) {
               return value+content;
           }
       };return genericCalculate(filePath,callback, "");
    }


    public int calculate2(String filePath, LineReaderCallback callback, int value) {
        FileReader fr = null;
        BufferedReader br = null;//템플릿에서 모든 공통부분 처리
        try {
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);
            String content;
            while ((content = br.readLine()) != null) {
                value = callback.doSomethingWithCallback(content, value);
            }//while문동안 계산을 반복한다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return value;
    }

    //계산로직만 따로 빼서 콜백을 만든다. 공통부분은 모두 템플릿으로 넣는다.
    public int calcSum(String filePath) {
        LineReaderCallback sumCallback = new LineReaderCallback() {
            @Override
            public int doSomethingWithCallback(String content, int value) throws Exception {
                //계산하는 로직
                value += Integer.parseInt(content);
                return value;
            }
        };
        return calculate2(filePath, sumCallback, 0);//콜백을 넣어서, 템플릿에 전달하면
    }

    public int calcMul(String filePath) {
        LineReaderCallback callback = new LineReaderCallback() {
            @Override
            public int doSomethingWithCallback(String content, int value) throws Exception {
                value *= Integer.parseInt(content);
                return value;
            }
        };
        return calculate2(filePath, callback, 1);
    }


    public int calculate(String filePath, BufferedReaderCallback callback) {
        int sum = 0;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);

            sum = callback.doSomethingWithReader(br);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sum;
    }

}

