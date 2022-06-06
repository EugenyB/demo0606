package com.example.demo0606.repository;

import com.example.demo0606.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    Artist findByName(String name);
}
