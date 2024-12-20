package com.course.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.springboot.webapp.springboot_web.models.dto.ParamDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

  @GetMapping("/foo")
  public ParamDto foo(@RequestParam String message) {
    ParamDto param = new ParamDto();
    param.setMessage(message != null ? message : "No message");
    return param;
  }

  @GetMapping("/bar")
  public ParamDto bar(@RequestParam String message, @RequestParam Integer code) {
    ParamDto param = new ParamDto();
    param.setMessage(message != null ? message : "No message");
    param.setCode(code != null ? code : 0);
    return param;
  }

  @GetMapping("/request")
  public ParamDto request(HttpServletRequest request) {
    Integer code = null;
    try {
      code = Integer.parseInt(request.getParameter("code"));
    } catch (Exception e) {
      code = 0;
    }
    ParamDto param = new ParamDto();
    param.setMessage(request.getParameter("message"));
    param.setCode(code);
    return param;
  }

}
