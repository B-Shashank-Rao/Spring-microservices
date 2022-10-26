package com.example.firstapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//in order to make it as a spring mvc class we need to use controller annotation
//in order to send response use responsebody annotation
//RestController is the combination of controller and responsebody annotation
//in order to make method as a rest end endpoint we need to use getmapping annotation
//@Controller
//@ResponseBody

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "HelloWorld";
	}
	
}
