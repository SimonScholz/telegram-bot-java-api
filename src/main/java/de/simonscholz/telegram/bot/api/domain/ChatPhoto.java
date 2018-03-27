package de.simonscholz.telegram.bot.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatPhoto {

	@JsonProperty(value = "small_file_id")
	private String smallFileId;

	@JsonProperty(value = "big_file_id")
	private String bigFileId;
}
