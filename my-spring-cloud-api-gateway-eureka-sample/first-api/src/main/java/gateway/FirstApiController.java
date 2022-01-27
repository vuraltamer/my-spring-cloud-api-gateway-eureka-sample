package gateway;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/first-api")
public class FirstApiController {

	@GetMapping("/call")
	public String test() {
		return "First api call!!!";
	}
}
