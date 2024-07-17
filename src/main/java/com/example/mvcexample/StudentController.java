package com.example.mvcexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@GetMapping("/")

	public String openLoginPage() {
		System.out.println("I am in controller");
		return "login";
	}

	@GetMapping("senddata")
	public String openLoginPage(@RequestParam String userName) {
		System.err.println(userName);
		System.out.println("I am in controller");
		return "login";
	}

}
