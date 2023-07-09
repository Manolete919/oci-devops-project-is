package com.claro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value = "/hello/{name}", produces = { "application/json" })
	public String hello(@PathVariable String name) {

		return "Esta es una nueva version Intance Group: " + name;

	}

}
