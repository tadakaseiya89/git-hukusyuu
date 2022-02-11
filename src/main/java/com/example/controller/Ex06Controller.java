package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex06")
public class Ex06Controller {

	@RequestMapping("")
	public String index() {
		return "ex-06";
	}

	@RequestMapping("/receive-info")
	public String receiveHobby(String name, String age, String comment) {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
		System.out.println("コメント：" + comment);
		return "finished";
	}

}
