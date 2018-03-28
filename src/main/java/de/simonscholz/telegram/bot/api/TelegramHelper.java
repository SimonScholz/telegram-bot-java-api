package de.simonscholz.telegram.bot.api;

import de.simonscholz.telegram.bot.api.domain.Message;
import de.simonscholz.telegram.bot.api.domain.Update;
import reactor.core.publisher.Mono;

public final class TelegramHelper {

	/**
	 * Used to get the {@link Message} object from an {@link Update}.
	 * 
	 * @param update
	 *            {@link Update}
	 * 
	 * @return {@link Mono} of a {@link Message}
	 */
	public static Mono<Message> getMessage(Update update) {
		if (update.getMessage() != null) {
			return Mono.just(update.getMessage());
		} else if (update.getEditedMessage() != null) {
			return Mono.just(update.getEditedMessage());
		} else if (update.getChannelPost() != null) {
			return Mono.just(update.getChannelPost());
		} else if (update.getEditedChannelPost() != null) {
			return Mono.just(update.getEditedChannelPost());
		}

		return Mono.empty();
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
