package com.example.demo0606.repository;

import com.example.demo0606.entities.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Integer> {
    Artist findByName(String name);
}