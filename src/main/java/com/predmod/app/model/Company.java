package com.predmod.app.model;

import java.util.UUID;

public class Company {
    private String name;
    private String location;
    private String industry;
    private String companySize;
    private final String estYear;
    private String about;

    public Company(String name,
                   String location,
                   String industry,
                   String companySize,
                   String estYear,
                   String about) {
        this.name = name;
        this.location = location;
        this.industry = industry;
        this.companySize = companySize;
        this.estYear = estYear;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
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
