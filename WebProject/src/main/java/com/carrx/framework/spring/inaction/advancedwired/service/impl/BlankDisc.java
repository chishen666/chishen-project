package com.xc.study.framework.spring.inaction.advancedwired.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlankDisc {

	private String title;

	private String artist;

	// public BlankDisc(@Value("${title}") String title, @Value("${artist}") String
	// artist) {
	// super();
	// this.title = title;
	// this.artist = artist;
	// }

	public BlankDisc(@Value("#{systemProperties['title']}") String title,
			@Value("#{systemProperties['artist']}") String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public void printf() {
		System.out.printf("%s by %s\n", title, artist);

	}

}
