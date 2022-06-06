package com.example.demo0606.controllers;

import com.example.demo0606.dto.ArtistDto;
import com.example.demo0606.exceptions.ValidationException;
import com.example.demo0606.service.ArtistService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
@AllArgsConstructor
@Log
public class ArtistController {

    private final ArtistService artistService;

    @PostMapping("/save")
    public ArtistDto saveArtist(@RequestBody ArtistDto artistDto) throws ValidationException {
        log.info("Handling save artist: " + artistDto);
        return artistService.saveArtist(artistDto);
    }

    @GetMapping("/findAll")
    public List<ArtistDto> findAllArtists() {
        log.info("Handling find all artists request");
        return artistService.findAll();
    }

    @GetMapping("/findByName")
    public ArtistDto findByName(@RequestParam String name) {
        log.info("Handling find by name request: " + name);
        return artistService.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteArtist(@PathVariable Integer id) {
        log.info("Handling delete artist request: " + id);
        artistService.deleteArtist(id);
        return ResponseEntity.ok().build();
    }
}
