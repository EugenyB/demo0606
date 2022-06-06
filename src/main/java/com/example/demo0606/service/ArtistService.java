package com.example.demo0606.service;

import com.example.demo0606.dto.ArtistDto;
import com.example.demo0606.exceptions.ValidationException;

import java.util.List;

public interface ArtistService {
    ArtistDto saveArtist(ArtistDto artistDto) throws ValidationException;

    void deleteArtist(Integer artistId);

    ArtistDto findByName(String name);

    List<ArtistDto> findAll();
}
