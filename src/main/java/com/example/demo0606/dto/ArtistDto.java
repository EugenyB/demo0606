package com.example.demo0606.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ArtistDto {
    private final Integer id;
    private final String name;
}
