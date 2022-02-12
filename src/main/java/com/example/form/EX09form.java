package com.example.form;

public class EX09form {
	private String email;
	private String pass;

	public String getEmail() {
		return email;
	}

	public void setEmail(String emal) {
		this.email = emal;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "EX09form [emal=" + email + ", pass=" + pass + "]";
	}

}