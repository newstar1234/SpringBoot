package com.example.ex00.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Component
@Getter
@RequiredArgsConstructor // @NonNull, final 필드만 초기화
// @AllArgsConstructor : 전체 필드 초기화
// @NoArgsConstructor : 기본 생성자
public class Coding {

  // 필드 주입 
  // 굉장히 편하게 주입할 수 있으나 순환 참조(무한 루프)시 오류가 발생하지 않기 때문에 StackOverFlow 발생
  // final을 사용할 수 없기 때문에 다른 곳에서 변형 가능
  // @Autowired
  // private Computer computer;

  // 생성자 주입
  // 순환 참조시 컴파일러 인지 가능, 오류 발생
  // 메모리에 할당되면서 초기 값으로 주입되므로 초기 값에 문제 발생 시 할당도 되지 않기 떄문이다.
  // 초기화 생성자를 사용하면 해당 객체에 final을 사용할수 있다. 다른 곳에서 변형 불가능
  // 의존성 주입이 되지 않으면 객체가 생성되지 않으므로 NPE를 방어(Nullpoint Exception=NPE) 
  private final Computer computer;

  // @Autowired
  // public Coding(Computer computer) {
  //   this.computer = computer;
  // }
  
}
