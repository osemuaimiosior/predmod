package com.predmod.app.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Company {
    private final int id;
    private String email;
    private String name;
    private String location;
    private String industry;
    private int companySize;
    private final int estYear;
    private String about;

    public Company(@JsonProperty("id") int id,
                    @JsonProperty("name") String name,
                   @JsonProperty("email") String email,
                    @JsonProperty("location")String location,
                    @JsonProperty("industry")String industry,
                    @JsonProperty("companySize")int companySize,
                    @JsonProperty("estYear")int estYear,
                    @JsonProperty("about")String about) {
                        this.id = id;
                        this.name = name;
                        this.email = email;
                        this.location = location;
                        this.industry = industry;
                        this.companySize = companySize;
                        this.estYear = estYear;
                        this.about = about;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
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

    public int getCompanySize() {
        return companySize;
    }

    public void setCompanySize(int companySize) {
        this.companySize = companySize;
    }

    public int getEstYear() {
        return estYear;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
