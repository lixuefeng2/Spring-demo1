package com.lixuefeng.d1;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class D1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(D1Application.class, args);
		
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.parallelSort(beanNames);
		
		for(String s: beanNames) {
			System.out.println(s);
		}
	}

}
