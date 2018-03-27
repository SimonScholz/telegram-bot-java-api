package de.simonscholz.telegram.bot.api;

import java.util.Optional;

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
	 * @return {@link Optional} of a {@link Message}
	 */
	public static Mono<Message> getMessage(Update update) {
		if (update.getMessage() != null) {
			return Mono.just(update.getMessage());
		} else if (update.getEdited_message() != null) {
			return Mono.just(update.getEdited_message());
		} else if (update.getChannel_post() != null) {
			return Mono.just(update.getChannel_post());
		} else if (update.getEdited_channel_post() != null) {
			return Mono.just(update.getEdited_channel_post());
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
