package com.ernesto.biruhunt.biruhunt.controllers;

import com.ernesto.biruhunt.biruhunt.model.Beer;
import com.ernesto.biruhunt.biruhunt.services.BeerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class BeerController {

    @Autowired
    private BeerServices beerServices;

    @RequestMapping("/beers/{beerId}")
    public Beer getBeer(@PathVariable String beerId){
        return beerServices.getBeer(beerId);
    }

    @RequestMapping("/beers")
    public List<Beer> getAllBeers(){
        return beerServices.getAllBeers();
    }

    @RequestMapping("/beers/popular")
    public List<Beer> getBeersByRatingDescending(){
        return beerServices.getBeerByRatingDescending();
    }

    //Add beer no brewery
    @RequestMapping(method = RequestMethod.POST, value = "/beers/{beerId}")
    public String addBeer(@RequestBody Beer beer){
        return (beerServices.addBeer(beer));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/beers/{beerId}")
    public void modifyBeer(@RequestBody Beer beer) {
        //TODO modify beer object
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/beers/{beerId}")
    public String deleteBeer(@PathVariable String beerId){
        return (beerServices.deleteBeer(beerId));
    }
}
