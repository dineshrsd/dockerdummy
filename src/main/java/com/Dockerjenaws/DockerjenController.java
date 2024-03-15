package com.Dockerjenaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="dockeraws")
public class DockerjenController{

	@GetMapping(value ="/hai")
	public String hai(){
		return "vanakam da mapala one soft la irthuthu";
	}
	
	@GetMapping(value="/why")
	public String eathuku() {
		return "eathuku java";
	}
	
}
