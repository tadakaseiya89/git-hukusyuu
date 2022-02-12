package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.EX07form;

@Controller
@RequestMapping("/ex07")
public class Ex07Controller {

	@RequestMapping("")
	public String index() {
		return "ex-07";
	}

	@ModelAttribute
	public EX07form setUpForm() {
		return new EX07form();
	}

	@RequestMapping("/calc")
	public String calc(EX07form form) {
		System.out.println(form.getIntNum1() * form.getIntNum2());
		return "finished";
	}

}
