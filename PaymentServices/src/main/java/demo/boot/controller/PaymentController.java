package demo.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	@GetMapping
	public String getMsg() {
		return "Payment Successsful";
	}

}
