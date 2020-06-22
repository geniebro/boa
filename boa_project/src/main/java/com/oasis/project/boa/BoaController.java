package com.oasis.project.boa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoaController {
	@RequestMapping("/")
	public String hello() {
		return "Hello BoA~~~!!";
	}
}
