package com.example.controller;

import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;

@Controller
@RequestMapping("/ex11")
public class Ex11Controller {

	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "ex-11-input";
	}

	@RequestMapping("/input1")
	public String input(User user) {
		
		application.setAttribute("user", user);
		return "ex-11-output";
	}

	@RequestMapping("/output1")
	public String output() {
		return "ex-11-output";
	}

	@RequestMapping("/output3")
	public String output2() {
		return "ex-11-output2";
	}
}
