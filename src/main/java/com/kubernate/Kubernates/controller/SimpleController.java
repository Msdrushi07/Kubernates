package com.kubernate.Kubernates.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class SimpleController {
	
	@GetMapping
	public String getMessage() {
		return "application is deployed on Kubernates";
	}

}
