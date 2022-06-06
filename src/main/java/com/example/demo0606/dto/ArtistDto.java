package com.example.demo0606.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArtistDto {
    private Integer id;
    private String name;
}
