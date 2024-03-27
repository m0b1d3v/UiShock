package dev.m0b1.uishock.index;

import dev.m0b1.uishock.html.Template;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static j2html.TagCreator.*;

@RestController
@RequiredArgsConstructor
public class Index {

	// Class constructor field(s)
	private final Template template;

	@GetMapping(value = "/")
	public String index() {

		var pTag = p("Main content");

		return template.build(pTag);
	}

}
