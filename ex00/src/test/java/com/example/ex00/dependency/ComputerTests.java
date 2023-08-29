package com.example.ex00.dependency;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class ComputerTests {
  // 단위 테스트에서는 필드 주입만 사용 가능하다.
  @Autowired
  Coding coding;
  
  @Test
  public void computerTest(){
    // 메소드 안에서 @Autowired를 사용할 수 없다.
  log.info(coding.getComputer().toString());
  }
}
