package de.simonscholz.telegram.bot.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	private int id;

	@JsonProperty(value = "is_bot")
	private boolean isBot;

	@JsonProperty(value = "first_name")
	private String firstName;

	@JsonProperty(value = "last_name")
	private String lastName;

	@JsonProperty(value = "username")
	private String userName;

	@JsonProperty(value = "language_code")
	private String languageCode;
}
