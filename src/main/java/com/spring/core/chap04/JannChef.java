package com.spring.core.chap04;

import org.springframework.stereotype.Component;
@Component("jc")
public class JannChef implements Chef {

    public void cook() {
        System.out.println("프랑스 요리의 대가 쟝입니다.");
    }
}
