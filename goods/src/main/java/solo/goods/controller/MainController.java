package solo.goods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String test(Model model) {
		model.addAttribute("test", "Hello thymeleaf");

		return "test";

	}

}
