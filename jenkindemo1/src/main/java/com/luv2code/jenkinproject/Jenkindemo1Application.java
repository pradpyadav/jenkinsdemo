package com.luv2code.jenkinproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jenkindemo1Application {
	
	int num1,num2;
	public static void SayHello(String name) {
		System.out.println("Hello  There : "+name);
	}/*****/
	public static void main(String[] args) {
		System.out.println("Welcome to the world of the  Jenkins DevOps");
		SpringApplication.run(Jenkindemo1Application.class, args);
		SayHello("Roger");
	}

}
