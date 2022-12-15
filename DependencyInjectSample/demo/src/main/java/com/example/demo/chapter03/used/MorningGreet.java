package com.example.demo.chapter03.used;

import org.springframework.stereotype.Component;

/**
 * Greet 구현 클래스<br>
 * 아침 인사하기
 */
//@Component
public class MorningGreet implements Greet{

    @Override
    public void greeting() {
        System.out.println("----------------");
        System.out.println("좋은 아침입니다.");
        System.out.println("----------------");
    }
}