package com.example.form;

public class EX06form {

	private String name;
	private String age;
	private String comment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "EX06form [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}

}
