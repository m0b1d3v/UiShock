package dev.m0b1.uishock.error;

import dev.m0b1.uishock.html.Template;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import static j2html.TagCreator.p;

@RestControllerAdvice
@RequiredArgsConstructor
public class Error {

	// Class constructor field(s)
	private final Template template;

	@ExceptionHandler(NoResourceFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String error404() {
		var errorTag = p("Resource could not be found");
		return template.build(errorTag);
	}

	@ExceptionHandler(Exception.class)
	public String error() {
		var errorTag = p("Server error");
		return template.build(errorTag);
	}

}
