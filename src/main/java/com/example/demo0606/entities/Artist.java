package com.example.demo0606.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "artist")
public class Artist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ArtistId", nullable = false)
    private Integer id;

    @Column(name = "Name", length = 120)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}