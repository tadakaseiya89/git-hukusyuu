package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex04")
public class Ex04Controller {

	@RequestMapping("")
	public String index() {
		return "ex-04";
	}

	@RequestMapping("/login")
	public String login(String email, String pass) {
		if (email.equals("abc@gmail.com") && pass.equals("abc")) {
			return "/ex-04-success";
		} else {
			return "/ex-04-failure";
		}

	}

}
