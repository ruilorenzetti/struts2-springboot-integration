package com.example.demo.action;

import com.example.demo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("serial")
public class HelloAction extends ActionSupport {

  @Autowired
  protected UserService userService;

  @Override
  public String execute() throws Exception {
    return SUCCESS;
  }

}
