package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.EX06form;

@Controller
@RequestMapping("/ex06")
public class Ex06Controller {

	@RequestMapping("")
	public String index() {
		return "ex-06";
	}

	@ModelAttribute
	public EX06form setUpForm() {
		return new EX06form();
	}

	@RequestMapping("/receive-info")
	public String receiveHobby(EX06form form) {
		System.out.println("名前：" + form.getName());
		System.out.println("年齢：" + form.getAge());
		System.out.println("コメント：" + form.getComment());
		return "finished";
	}

}
