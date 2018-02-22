package de.simonscholz.telegram.bot.api;

import java.util.Optional;

import de.simonscholz.telegram.bot.api.domain.Message;
import de.simonscholz.telegram.bot.api.domain.Update;
import reactor.core.publisher.Mono;

public final class TelegramHelper {

	/**
	 * Used to get the {@link Message} object from an {@link Update}.
	 * @param update {@link Update}
	 * 
	 * @return {@link Optional} of a {@link Message}
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
		String username = message.getFrom().getUsername();
		if (username != null && !username.isEmpty()) {
			return username;
		}
		username = message.getFrom().getFirst_name();

		if (username != null && !username.isEmpty()) {
			String lastName = message.getFrom().getLast_name();
			if (lastName != null && !lastName.isEmpty()) {
				return username + " " + lastName;
			}
			return username;
		}

		return message.getChat().getUsername();
	}
}
