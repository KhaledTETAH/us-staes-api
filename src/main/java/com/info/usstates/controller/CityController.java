package com.info.usstates.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.usstates.entity.City;
import com.info.usstates.service.CityServiceImpl;

@RestController
@RequestMapping("/api/cities")
public class CityController {
    
    @Autowired
    private CityServiceImpl cityService;

    @GetMapping(value = "/all")
    public List<City> findAllcities(){

        return cityService.getAllCities();
    }
}
