package com.ernesto.biruhunt.biruhunt.services;

import com.ernesto.biruhunt.biruhunt.model.Beer;
import com.ernesto.biruhunt.biruhunt.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class BeerServices {

    @Autowired
    private BeerRepository beerRepository;

    public List<Beer> getAllBeers(){
        List<Beer> beers = new ArrayList<>();
        beerRepository.findAll().forEach(beers::add);
        return beers;
    }

    public List<Beer> getBeerByRatingDescending(){
        List<Beer> beers = new ArrayList<>();
        beerRepository.findAllByOrderByRatingDesc().forEach(beers::add);
        return beers;
    }

    /*public List<Beer> getAllBeersByBrewery(String breweryId){
        List<Beer> beers = new ArrayList<>();
        beerRepository.findByBreweryId(breweryId).forEach(beers::add);
        return beers;
    }*/

    public Beer getBeer(String beerId){
            return beerRepository.findByBeerId(beerId);/*.
                                  orElseThrow(() -> new EntityNotFoundException(beerId));*/
    }

    public String addBeer(Beer beer){
        if(!beerRepository.existsByBeerId(beer.getBeerId())){
            beerRepository.save(beer);
            return "200";
        }else
            return "409";
    }

    public void modifyBeer(Beer beer){

    }

    public String deleteBeer(String beerId){

        if(beerRepository.existsByBeerId(beerId)){
            beerRepository.deleteById(beerId);
            return "0";
        }else
            return "1";
    }
}
