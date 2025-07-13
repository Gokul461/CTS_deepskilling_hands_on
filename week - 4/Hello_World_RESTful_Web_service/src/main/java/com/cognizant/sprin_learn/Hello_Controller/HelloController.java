package com.cognizant.sprin_learn.Hello_Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.sprin_learn.Service.HelloService;

@RestController
public class HelloController {
	private HelloService service;
    public HelloController(HelloService service) {
        this.service = service;
    }
	
	@GetMapping("/hello")
	public String sayHello() {
		return service.sayHello();
	}
}
