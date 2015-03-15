package com.williewheeler.songs.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.williewheeler.songs.entity.Song;

public interface SongRepo extends MongoRepository<Song, String> {
	
	Page<Song> findByArtist(@Param("artist") String artist, Pageable pageable);
}
