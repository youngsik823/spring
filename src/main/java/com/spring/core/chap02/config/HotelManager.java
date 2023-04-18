package com.spring.core.chap02.config;

import com.spring.core.chap02.Chef;
import com.spring.core.chap02.KimuraChef;

// 호텔을 운영하기 위한 객체들을 만들어서
// 호텔에 주입해주는 클래스
// Spring Container: Bean Factory
public class HotelManager {

    public Chef chef() {
        return new KimuraChef();
    }

}
