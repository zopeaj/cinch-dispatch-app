package com.app.cinchdispatch.controller;



@RestController
@RequestMapping
public class CinchDispatchController {

  @GetMapping("/")
  public String index() {
    return "Hello World from Spring Boot";
  }
}
