package com.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Text {
	
	@GetMapping(value="/Text")
	String showText() {
		return "hi this my docker ex";
	}

}
