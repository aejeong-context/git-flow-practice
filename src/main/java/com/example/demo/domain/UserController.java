package com.example.demo.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

  @GetMapping("/user")
  public void getUser() {
    System.out.printf("get User");
  }
}
