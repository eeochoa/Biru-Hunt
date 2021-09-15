package com.ernesto.biruhunt.biruhunt.repository;

import com.ernesto.biruhunt.biruhunt.model.Beer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BeerRepository extends CrudRepository<Beer, String> {

    public Beer findByBeerId(String beerId);
    public void deleteByBeerId(String beerId);
    public Boolean existsByBeerId(String beerId);
    public List<Beer> findBeerByBeerId(String beerId);
    public List<Beer> findAllByOrderByRatingDesc();

    //public List<Beer> findByBreweryId(String brewerId);
}
