package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ActivitiesController {


	@GetMapping(value = "/test")
	public String activities () {
		
		return "hello";
		
	}
}
