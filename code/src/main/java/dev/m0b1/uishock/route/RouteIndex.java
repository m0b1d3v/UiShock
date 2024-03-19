package dev.m0b1.uishock.route;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class RouteIndex {

	@GetMapping("/")
	public String index() {
		return "index";
	}

}
