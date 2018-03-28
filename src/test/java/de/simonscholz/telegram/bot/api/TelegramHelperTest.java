package de.simonscholz.telegram.bot.api;

import org.junit.Test;

import de.simonscholz.telegram.bot.api.domain.Message;
import de.simonscholz.telegram.bot.api.domain.Update;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class TelegramHelperTest {

	@Test
	public void test() {
		Mono<Message> message = TelegramHelper.getMessage(new Update());
		StepVerifier.create(message).expectComplete();
	}

}
