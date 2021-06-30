package malaysia.bill.price.MalaysiaBillPrice.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/error")
public class ErrorController {

	@RequestMapping("/error")
	public String somethingWentWrong() {

		return "Something went wrong";
	}
}
