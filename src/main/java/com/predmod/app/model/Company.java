package com.predmod.app.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Company {
    private final UUID id;
    public UUID getId() {
        return id;
    }

    private String name;
    private String location;
    private String industry;
    private String companySize;
    private final String estYear;
    private String about;

    public Company(@JsonProperty("id") UUID id,
                    @JsonProperty("name") String name,
                    @JsonProperty("location")String location,
                    @JsonProperty("industry")String industry,
                    @JsonProperty("companySize")String companySize,
                    @JsonProperty("estYear")String estYear,
                    @JsonProperty("about")String about) {
        this.name = name;
        this.location = location;
        this.industry = industry;
        this.companySize = companySize;
        this.id = id;
        this.estYear = estYear;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public String getEstYear() {
        return estYear;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
