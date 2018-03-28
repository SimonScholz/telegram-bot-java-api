package de.simonscholz.telegram.bot.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class File {
	@JsonProperty(value = "file_id")
	private String fileId;
	@JsonProperty(value = "file_size")
	private int fileSize;
	@JsonProperty(value = "file_path")
	private String filePath;
}
