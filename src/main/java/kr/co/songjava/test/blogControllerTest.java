package kr.co.songjava.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class blogControllerTest {

	@GetMapping("/test/hello")
	public String hello() {
		return "hello Spring boot";
	}
}
