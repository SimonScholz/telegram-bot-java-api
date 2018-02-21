package de.simonscholz.telegram.bot.api;

import com.jakewharton.retrofit2.adapter.reactor.ReactorCallAdapterFactory;

import de.simonscholz.telegram.bot.api.domain.File;
import de.simonscholz.telegram.bot.api.domain.Message;
import de.simonscholz.telegram.bot.api.domain.TelegramListResponse;
import de.simonscholz.telegram.bot.api.domain.TelegramObjectResponse;
import de.simonscholz.telegram.bot.api.domain.Update;
import reactor.core.publisher.Mono;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface TelegramBotClient {

	static TelegramBotClient createRxJson(String baseUrl, String botToken) {
		Builder builder = new Retrofit.Builder().addConverterFactory(JacksonConverterFactory.create())
				.addCallAdapterFactory(ReactorCallAdapterFactory.create());

		return builder.baseUrl(baseUrl + botToken + "/").build().create(TelegramBotClient.class);
	}

	@POST("sendMessage")
	@FormUrlEncoded
	Mono<Message> sendMessage(@Field("chat_id") long chatId, @Field("text") String text);

	@POST("sendPhoto")
	@FormUrlEncoded
	Mono<Message> sendPhoto(@Field("chat_id") long chatId, @Field("photo") String photoUrl);

	@GET("getUpdates")
	Mono<TelegramListResponse<Update>> getUpdates();

	@GET("getUpdates")
	Mono<TelegramListResponse<Update>> getUpdates(@Query("offset") int offset);

	@GET("getFile")
	Mono<TelegramObjectResponse<File>> getFile(@Query("file_id") String fileId);

	@GET("getChatMembersCount")
	Mono<TelegramObjectResponse<Integer>> getChatMembersCount(@Query("chat_id") String chatId);
}
