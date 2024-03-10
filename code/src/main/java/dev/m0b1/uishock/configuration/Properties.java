package dev.m0b1.uishock.configuration;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties("uishock")
@Data
@Validated
public class Properties {

	@NotNull
	private Boolean development;

}
