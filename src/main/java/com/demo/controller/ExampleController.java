package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ExampleController {

   
    
    @GetMapping(value = "/")
    public String hello() {
    	return "Hello World modified v3!!! live demo";
    }
    
    
    @GetMapping(value = "/test")
    public String process() {
    	return "processing request-aws !!-done";
    }

    
   
    
  
}
