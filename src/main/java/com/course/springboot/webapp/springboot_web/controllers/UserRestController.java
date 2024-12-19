package com.course.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.springboot.webapp.springboot_web.models.User;
import com.course.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/details")
  public UserDto details() {

    User user = new User("Antonio", "Espinoza");

    UserDto userDto = new UserDto();
    userDto.setTitle("Hola Mundo Spring Boot");
    userDto.setUser(user);

    return userDto;
  }

  @GetMapping("/details-map")
  public Map<String, Object> detailsMap() {

    User user = new User("Antonio", "Espinoza");

    Map<String, Object> body = new HashMap<>();

    body.put("title", "Hola Mundo Spring Boot");
    body.put("user", user);

    return body;
  }

}