package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class sampletest {

	@BeforeAll
	static void beforeALL() {
		System.out.println("beforeALL");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("afterAll");
	}
@BeforeEach
	static void beforEach() {
		System.out.println("beforEach");
	}
@AfterEach
static void afterEach() {
	System.out.println("afterEach");
}

	@Test
	void test() {
		System.out.println("test1");
	}

	@Test
	void test2() {
		System.out.println("test2");
	}

	
}
