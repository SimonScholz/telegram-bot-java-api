package de.simonscholz.telegram.bot.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Document {
	@JsonProperty(value = "file_id")
	private String fileId;
	private PhotoSize thumb;
	@JsonProperty(value = "file_name")
	private String fileName;
	@JsonProperty(value = "mime_type")
	private String mimeType;
	@JsonProperty(value = "file_size")
	private int fileSize;
}
