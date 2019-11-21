package com.chungle.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @GetMapping("/")
  public String home() {
    return "Hello this is message from Demo 1 application";
  }

  @GetMapping("/SpringService")
  public String helth() {
    return "OK";
  }

  @GetMapping("test")
  public String test() {
    return "Hello Chung 222";
  }
}
