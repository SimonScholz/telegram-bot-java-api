package de.simonscholz.telegram.bot.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TelegramListResponse<T> {
	private boolean ok;
	private List<T> result;
}
