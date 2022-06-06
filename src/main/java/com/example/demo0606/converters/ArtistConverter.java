package com.example.demo0606.converters;

import com.example.demo0606.dto.ArtistDto;
import com.example.demo0606.entities.Artist;
import org.springframework.stereotype.Component;

@Component
public class ArtistConverter {
    public Artist fromArtistDtoToArtist(ArtistDto artistDto) {
        Artist artist = new Artist();
        artist.setId(artistDto.getId());
        artist.setName(artistDto.getName());
        return artist;
    }

    public ArtistDto fromArtistToArtistDto(Artist artist) {
        return ArtistDto.builder()
                .id(artist.getId())
                .name(artist.getName())
                .build();
    }
}
