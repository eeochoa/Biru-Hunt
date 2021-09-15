package com.ernesto.biruhunt.biruhunt.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Beer {

    @Id
    private String beerId;
    private String name;
    private String abv;
    private String description;
    private String beerType;
    private double rating;
    private int votes;
    private String active;
    @OneToMany
    private List<Location> locations;


    public Beer(){

    }

    public Beer(String id, String name, String abv, String description, double rating, int votes, String active) {
        this.beerId = id;
        this.name = name;
        this.abv = abv;
        this.description = description;
        this.rating = rating;
        this.votes = votes;
        this.active = active;
    }

    public Beer(String id, String name, String abv, String description, String beerType, double rating, int votes, String active) {
        this.beerId = id;
        this.name = name;
        this.abv = abv;
        this.description = description;
        this.beerType = beerType;
        this.rating = rating;
        this.votes = votes;
        this.active = active;
    }

    public Beer(String id, String name, String abv, String description, double rating, String active, List<Location> locations) {
        this.beerId = id;
        this.name = name;
        this.abv = abv;
        this.description = description;
        this.rating = rating;
        this.active = active;
        this.locations = locations;
    }

    public String getBeerId() {
        return beerId;
    }

    public void setBeerId(String beerId) {
        this.beerId = beerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbv() {
        return abv;
    }

    public void setAbv(String abv) {
        this.abv = abv;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getBeerType() {
        return beerType;
    }

    public void setBeerType(String beerType) {
        this.beerType = beerType;
    }
}

@Entity
class Location{

    @Id
    private String location;

    public Location(){

    }

    public Location (String location){
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}