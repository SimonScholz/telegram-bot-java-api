package de.simonscholz.telegram.bot.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Chat {

	public static final String TYPE_PRIVATE = "private";
	public static final String TYPE_GROUP = "group";
	public static final String TYPE_SUPERGROUP = "supergroup";
	public static final String TYPE_CHANNEL = "channel";

	private long id;
	private String type;
	private String title;

	@JsonProperty(value = "username")
	private String userName;

	@JsonProperty(value = "first_name")
	private String firstName;

	@JsonProperty(value = "last_name")
	private String lastName;

	@JsonProperty(value = "all_members_are_administrators")
	private boolean allMembersAreAdmins;

	@JsonProperty(value = "photo")
	private ChatPhoto chatPhoto;

	private String description;

	@JsonProperty(value = "invite_link")
	private String inviteLink;

	@JsonProperty(value = "pinned_message")
	private Message pinnedMessage;

	@JsonProperty(value = "sticker_set_name")
	private String stickerSetName;

	@JsonProperty(value = "can_set_sticker_set")
	private boolean canSetStickerSet;

}
