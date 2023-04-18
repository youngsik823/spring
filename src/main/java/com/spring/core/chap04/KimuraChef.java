package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("kc") // kc로 정하면 이름이 kc로 변환된다.
                // 이름을 안정하면 생성자 처음 소문자 이름으로 들어간다
                    // kimuraChef
public class KimuraChef implements Chef {

    public void cook() {
        System.out.println("일식 요리의 대가 키무라입니다.");
    }
}
