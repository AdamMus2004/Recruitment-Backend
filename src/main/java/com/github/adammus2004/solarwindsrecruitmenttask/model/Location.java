package com.github.adammus2004.solarwindsrecruitmenttask.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Location {
    @Id
    Long id;
    String name;
    String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
