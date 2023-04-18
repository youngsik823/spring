package com.spring.core.chap02;


public class Hotel {
    // OCP위반

    // 레스토랑 객체에 의존
    private Restaurant restaurant;

    // 헤드 쉐프
    private Chef headChef;


    // 호텔의 정보를 알려주는 기능
    public void inform() {
        System.out.printf("우리 호텔의 레스토랑은 %s입니다. 헤드쉐프는 %s입니다.\n"
                , restaurant.getClass().getSimpleName()
                , headChef.getClass().getSimpleName()
        );

        restaurant.order();
    }

}