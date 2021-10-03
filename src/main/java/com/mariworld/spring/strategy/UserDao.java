package com.mariworld.spring.strategy;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserDao {

    private final Context context;

    //context를 분리함으로써 다른 Dao클래스도 콘텍스트를 공유할 수 있다.
    //context분리, 바뀌는 부분은 전략으로 분리 ( 익명객체 활용가능 )
    public void contextWithStatementStrategy2(StatementStrategy st){
        context.workWithStatementStrategy(st);
    }

    public void contextWithStatementStrategy(StatementStrategy st){
        System.out.println("context...");
        st.makeStatement();
        System.out.println("Handle Exception....");
    }
}
