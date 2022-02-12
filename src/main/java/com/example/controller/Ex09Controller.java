package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.EX09form;

@Controller
@RequestMapping("/ex09")
public class Ex09Controller {

	@RequestMapping("")
	public String index() {
		return "ex-09";
	}

	@ModelAttribute
	public EX09form setUpForm() {
		return new EX09form();
	}

	@RequestMapping("/request")
	public String request(EX09form form, Model model) {
		if (form.getEmail().equals("abc@gmail.com") && form.getPass().equals("abc")) {
			model.addAttribute("result", "成功");
		} else {
			model.addAttribute("result", "失敗");
		}

		return "ex-09-result";
	}

}
