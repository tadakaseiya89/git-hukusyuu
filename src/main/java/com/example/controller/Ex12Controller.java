package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;
import com.example.form.EX09form;
import com.example.form.Ex12form;

@Controller
@RequestMapping("/ex12")
public class Ex12Controller {

	@RequestMapping("")
	public String index() {
		return "ex-12-register-member";
	}

	@ModelAttribute
	public Ex12form setForm() {
		return new Ex12form();
	}

	@RequestMapping("/ziko")
	public String ziko(Ex12form form, Model model) {
		Member member = new Member();
		member.setName(form.getName());
		member.setAge(form.getIntAge());
		member.setMoney(form.getIntMoney());
		member.setComment(form.getComment());

		model.addAttribute("member", member);
		return "ex-12-register-member-output";
	}

}
