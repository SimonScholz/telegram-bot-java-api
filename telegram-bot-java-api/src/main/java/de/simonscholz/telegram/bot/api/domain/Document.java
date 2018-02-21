package de.simonscholz.telegram.bot.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Document {
	private String file_id;
	private PhotoSize thumb;
	private String file_name;
	private String mime_type;
	private int file_size;
}
