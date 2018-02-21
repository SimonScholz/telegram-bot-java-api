package de.simonscholz.telegram.bot.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Update {
	private int update_id;
	private Message message;
	private Message edited_message;
	private Message channel_post;
	private Message edited_channel_post;
}
