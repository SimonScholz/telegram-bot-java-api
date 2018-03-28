package de.simonscholz.telegram.bot.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PhotoSize {
	@JsonProperty(value = "file_id")
	private String fileId;
	private int width;
	private int height;
	@JsonProperty(value = "file_size")
	private int fileSize;
}
