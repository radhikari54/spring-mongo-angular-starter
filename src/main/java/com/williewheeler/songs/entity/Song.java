package com.williewheeler.songs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {
	@Id private String id;
	private String title;
	private String artist;
	private String album;
}
