package com.course.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.springboot.webapp.springboot_web.models.User;
import com.course.springboot.webapp.springboot_web.models.dto.ParamDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

  @GetMapping("/baz/{message}")
  public ParamDto baz(@PathVariable String message) {
    ParamDto param = new ParamDto();
    param.setMessage(message);
    return param;
  }

  @PostMapping("/create")
  public User creatUser(@RequestBody User user) {
    // Do something with the user
    return user;
  }

}
