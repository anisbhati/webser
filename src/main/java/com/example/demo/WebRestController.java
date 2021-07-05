package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
	
	public String Test() {
		return "its working";
	}

}
