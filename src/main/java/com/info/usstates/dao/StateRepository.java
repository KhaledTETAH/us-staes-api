package com.info.usstates.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.usstates.entity.State;

public interface StateRepository extends JpaRepository<State, Integer>{
    
    List<State> findAllByName(String name);
    List<State> findAllByCode(String code);
    List<State> findAllByAdmissionDateAfter(Date date);
    List<State> findAllByAdmissionDateBefore(Date date);
    List<State> findAllByOrderByAdmissionDateAsc();
    List<State> findAllByOrderByAdmissionDateDesc();
    List<State> findAllByPopulationGreaterThanEqual(double p);
    List<State> findAllByPopulationLessThanEqual(double p);
    List<State> findAllByOrderByPopulationAsc();
    List<State> findAllByOrderByPopulationDesc();
}
