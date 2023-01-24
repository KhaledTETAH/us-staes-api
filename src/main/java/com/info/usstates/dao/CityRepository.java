package com.info.usstates.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.usstates.entity.City;

public interface CityRepository extends JpaRepository<City, Integer>{
    List<City> findAll();
}
