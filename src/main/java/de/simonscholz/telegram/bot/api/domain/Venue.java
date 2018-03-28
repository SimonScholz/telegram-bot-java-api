package de.simonscholz.telegram.bot.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Venue {
	private Location location;
	private String title;
	private String address;
	@JsonProperty(value = "foursquare_id")
	private String foursquareId;
}
