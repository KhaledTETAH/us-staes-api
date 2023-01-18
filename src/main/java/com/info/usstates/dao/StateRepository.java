package com.info.usstates.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.usstates.entity.State;

public interface StateRepository extends JpaRepository<State, Integer>{
    
    List<State> findAllByName(String name);
    List<State> findAllByCode(String code);

    /* admission date */
    List<State> findAllByAdmissionDateAfter(Date date);
    List<State> findAllByAdmissionDateBefore(Date date);
    List<State> findAllByOrderByAdmissionDateAsc();
    List<State> findAllByOrderByAdmissionDateDesc();

    /* population */
    List<State> findAllByPopulationGreaterThanEqual(double p);
    List<State> findAllByPopulationLessThanEqual(double p);
    List<State> findAllByOrderByPopulationAsc();
    List<State> findAllByOrderByPopulationDesc();

    /* area km */
    List<State> findAllByAreaKmGreaterThanEqual(double area);
    List<State> findAllByAreaKmLessThanEqual(double area);
    List<State> findAllByOrderByAreaKmAsc();
    List<State> findAllByOrderByAreaKmDesc();

    /* area Mile */
    List<State> findAllByAreaMileGreaterThanEqual(double area);
    List<State> findAllByAreaMileLessThanEqual(double area);
    List<State> findAllByOrderByAreaMileAsc();
    List<State> findAllByOrderByAreaMileDesc();
}
