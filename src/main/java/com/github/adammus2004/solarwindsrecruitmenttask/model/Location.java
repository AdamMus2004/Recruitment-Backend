package com.github.adammus2004.solarwindsrecruitmenttask.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Location {
    @Id
    Long id;
    String name;
    String url;
}
