package com.example2.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextMessage2 {
	
 @GetMapping(value = "/showmessage") 
   String Message() {
	   return "Hello World!";
	   
   }

}
