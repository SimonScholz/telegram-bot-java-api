package de.simonscholz.telegram.bot.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Update {
	@JsonProperty(value = "update_id")
	private int updateId;
	private Message message;
	@JsonProperty(value = "edited_message")
	private Message editedMessage;
	@JsonProperty(value = "channel_post")
	private Message channelPost;
	@JsonProperty(value = "edited_channel_post")
	private Message editedChannelPost;
}
