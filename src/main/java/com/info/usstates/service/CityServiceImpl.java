package com.info.usstates.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.usstates.dao.CityRepository;
import com.info.usstates.entity.City;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAllCities() {

        return cityRepository.findAll();
    }
    
}
