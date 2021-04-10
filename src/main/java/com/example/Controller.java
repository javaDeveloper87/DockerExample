package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class Controller {

	@GetMapping("/v1")
	  public String home() {
	    return "Hello Docker World";
	  }

	@GetMapping("/v2")
	  public String home1() {
	    return "Hello Docker1 World";
	  }

}
