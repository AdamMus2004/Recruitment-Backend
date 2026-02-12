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

    public List<Episode> getEpisode() {
        return episode;
    }

    public void setEpisode(List<Episode> episode) {
        this.episode = episode;
    }
}
