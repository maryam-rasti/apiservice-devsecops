package com.bbk.api.apiservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
	
	@GetMapping("/welcome")
	public String welcome() {
		return"welcome to DevSecOps class";
	}

	// @GetMapping("/version")
	// public String welcome() {
	// 	return"welcome to DevSecOps class";
	// }


}
