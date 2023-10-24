package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ExampleController {

   
    
    @GetMapping(value = "/")
    public String hello() {
    	return "Hello World modified  live demo v3 some added ";
    }
    
    
    @GetMapping(value = "/test")
    public String process() {
    	return "processing request-aws !!-done";
    }

      @GetMapping(value = "/books")
    public String getbooks() {
    	return "details of all books";
    }
     @GetMapping(value = "/library")
    public String getLibrary() {
    	return "Welcome to our Library!!";
    }
   
    
  
}
