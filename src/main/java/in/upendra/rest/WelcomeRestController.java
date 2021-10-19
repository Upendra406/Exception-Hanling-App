package in.upendra.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		System.out.println("JMeter Executed.....");
		String msg = "Welcome To Uppi World";
  //		int i = 10/0;
		return msg;
	}

}
