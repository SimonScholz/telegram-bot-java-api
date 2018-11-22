package de.simonscholz.telegram.bot.api;

import java.util.Optional;

import de.simonscholz.telegram.bot.api.domain.Message;
import de.simonscholz.telegram.bot.api.domain.Update;

public final class TelegramHelper {

	/**
	 * Used to get the {@link Message} object from an {@link Update}.
	 * 
	 * @param update
	 *            {@link Update}
	 * 
	 * @return {@link Optional} of a {@link Message}
	 */
	public static Optional<Message> getMessage(Update update) {
		if (update.getMessage() != null) {
			return Optional.of(update.getMessage());
		} else if (update.getEditedMessage() != null) {
			return Optional.of(update.getEditedMessage());
		} else if (update.getChannelPost() != null) {
			return Optional.of(update.getChannelPost());
		} else if (update.getEditedChannelPost() != null) {
			return Optional.of(update.getEditedChannelPost());
		}

		return Optional.empty();
	}

	public static String getUserName(Message message) {
		String username = message.getFrom().getUserName();
		if (username != null && !username.isEmpty()) {
			return username;
		}
		username = message.getFrom().getFirstName();

		if (username != null && !username.isEmpty()) {
			String lastName = message.getFrom().getLastName();
			if (lastName != null && !lastName.isEmpty()) {
				return username + " " + lastName;
			}
			return username;
		}

		return message.getChat().getUserName();
	}
}
