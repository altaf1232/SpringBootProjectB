package com.springbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	  @RequestMapping("/Home_A")
	  public String home_a() 
	  {
		  return "this is my fisrt method ";
	  }
	  @RequestMapping("/Home_B")
	  public String home_b()
	  {
		  return "this is my second method ";
	  }
}