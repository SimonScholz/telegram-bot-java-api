package de.simonscholz.telegram.bot.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	private int id;
	private boolean is_bot;
	private String first_name;
	private String last_name;
	private String username;
	private String language_code;
}
