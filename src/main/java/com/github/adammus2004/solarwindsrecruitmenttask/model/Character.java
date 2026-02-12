package com.github.adammus2004.solarwindsrecruitmenttask.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;
@Entity
public class Character {
    @Id
    Long id;
    String name;
    String url;
    @ManyToMany
    List<Episode> episode;
}
