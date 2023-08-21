package com.Day2Excercises.Day2Excercise1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
@Value("${var}")
private String name;
@GetMapping("/")
public String show() {
	return "Hello Everyone!.This is "+name;
}
}
