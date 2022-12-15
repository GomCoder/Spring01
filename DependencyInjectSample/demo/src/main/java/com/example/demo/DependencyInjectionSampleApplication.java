package com.example.demo;

import com.example.demo.chapter03.used.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 스프링 기동 클래스
 */
@SpringBootApplication
public class DependencyInjectionSampleApplication {
	/**
	 * main메서드
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionSampleApplication.class, args)
				.getBean(DependencyInjectionSampleApplication.class).execute();
	}
	/**
	 * 주입하는 곳(인터페이스)
	 */
	@Autowired
	Greet greet;

	/**
	 * 실행 메서드
	 */
	private void execute() {
		greet.greeting();
	}
}


