package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex07")
public class Ex07Controller {

	@RequestMapping("")
	public String index() {
		return "ex-07";
	}

	@RequestMapping("/calc")
	public String calc(Integer num1, Integer num2) {
		System.out.println(num1 * num2);
		return "finished";
	}

}
