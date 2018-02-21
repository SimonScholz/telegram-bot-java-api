package de.simonscholz.telegram.bot.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
	private int message_id;
	private int forward_from_message_id;

	private User from;
	private User forward_from;

	private int date;
	private int forward_date;
	private int edit_date;

	private Chat chat;
	private Chat forward_from_chat;

	private String text;

	private String media_group_id;

	private Location location;

	private Venue venue;

	private List<PhotoSize> photo;
	private List<MessageEntity> entities;
	private List<MessageEntity> caption_entities;

	private Document document;
}
