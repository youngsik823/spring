package com.spring.core.person;

import lombok.*;

@Setter @Getter @ToString @EqualsAndHashCode
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 파라미터 생성자

//@Data // 실무에서는 사용 안하는게 좋다. 예를들어 세터를 빼야할때는 못뺀다.
      // 위에있는 전체를 만들어준다.
public class Person {

    private String nickName;
    private String address;
    private int age;

}
