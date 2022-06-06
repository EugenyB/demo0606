package com.example.demo0606.service;

import com.example.demo0606.converters.ArtistConverter;
import com.example.demo0606.dto.ArtistDto;
import com.example.demo0606.entities.Artist;
import com.example.demo0606.exceptions.ValidationException;
import com.example.demo0606.repository.ArtistRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DefaultArtistService implements ArtistService {

    private final ArtistRepository artistRepository;

    private final ArtistConverter artistConverter;

    @Override
    public ArtistDto saveArtist(ArtistDto artistDto) throws ValidationException {
        validateArtistDto(artistDto);
        Artist artist = artistRepository.save(artistConverter.fromArtistDtoToArtist(artistDto));
        return artistConverter.fromArtistToArtistDto(artist);
    }

    private void validateArtistDto(ArtistDto artistDto) throws ValidationException {
        if (artistDto == null) {
            throw new ValidationException("Object Artist is null");
        }
        if (artistDto.getName() == null || artistDto.getName().isEmpty()) {
            throw new ValidationException("Name is empty");
        }
    }

    @Override
    public void deleteArtist(Integer artistId) {
        artistRepository.deleteById(artistId);
    }

    @Override
    public ArtistDto findByName(String name) {
        Artist artist = artistRepository.findByName(name);
        if (artist != null) {
            return artistConverter.fromArtistToArtistDto(artist);
        }
        return null;
    }

    @Override
    public List<ArtistDto> findAll() {
        return artistRepository
                .findAll()
                .stream()
                .map(artistConverter::fromArtistToArtistDto)
                .toList();
    }
}
