package de.simonscholz.telegram.bot.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {

	@JsonProperty(value = "message_id")
	private int messageId;

	private User from;
	private int date;
	private Chat chat;

	@JsonProperty(value = "forward_from")
	private User forwardFrom;

	@JsonProperty(value = "forward_from_chat")
	private Chat forwardFromChat;

	@JsonProperty(value = "forward_from_message_id")
	private int forwardFromMessageId;

	@JsonProperty(value = "forward_signature")
	private String forwardSignature;

	@JsonProperty(value = "forward_date")
	private int forwardDate;

	@JsonProperty(value = "reply_to_message")
	private Message replyToMessage;

	@JsonProperty(value = "edit_date")
	private int editDate;

	@JsonProperty(value = "media_group_id")
	private String mediaGroupId;

	@JsonProperty(value = "author_signature")
	private String authorSignature;

	private String text;
	private List<MessageEntity> entities;

	@JsonProperty(value = "caption_entities")
	private List<MessageEntity> captionEntities;

	private Audio audio;
	private Document document;
	private Game game;
	private List<PhotoSize> photo;
	private Sticker sticker;
	private Video video;
	private Voice voice;

	@JsonProperty(value = "video_note")
	private VideoNote videoNote;

	private Contact contact;
	private Location location;
	private Venue venue;

	@JsonProperty(value = "new_chat_members")
	private List<User> newChatMember;

	@JsonProperty(value = "left_chat_member")
	private User leftChatMember;

	@JsonProperty(value = "new_chat_title")
	private User newChatTitle;

	@JsonProperty(value = "new_chat_photo")
	private List<PhotoSize> newChatPhoto;

	@JsonProperty(value = "delete_chat_photo")
	private boolean deleteChatPhoto;

	@JsonProperty(value = "group_chat_created")
	private boolean groupChatCreated;

	@JsonProperty(value = "supergroup_chat_created")
	private boolean supergroupChatCreated;

	@JsonProperty(value = "channel_chat_created")
	private boolean channelChatCreated;

	@JsonProperty(value = "migrate_to_chat_id")
	private int migrateToChatId;

	@JsonProperty(value = "migrate_from_chat_id")
	private int migrateFromChatId;

	@JsonProperty(value = "pinned_message")
	private Message pinnedMessage;

	private Invoice invoice;

	@JsonProperty(value = "successful_payment")
	private SuccessfulPayment successfulPayment;

	@JsonProperty(value = "connected_website")
	private String connectWebsite;

}
