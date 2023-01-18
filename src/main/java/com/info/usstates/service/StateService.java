package com.info.usstates.service;

import java.util.List;
import java.util.Optional;

import com.info.usstates.entity.State;

public interface StateService {

    List<State> getAllStates();
    Optional<State> getStateById(int id);
    List<State> getStateByName(String name);
    List<State> getStateByCode(String code);

    /* admission date */
    List<State> getStatesAfterAdmissionDate(String date);
    List<State> getStatesBeforeAdmissionDate(String date);
    List<State> getStatesByOrderByAdmissionDateAsc();
    List<State> getStatesByOrderByAdmissionDateDesc();

    /* population */
    List<State> getStatesByPopulationGreaterThanEqual(double p);
    List<State> getStatesByPopulationLessThanEqual(double p);
    List<State> getStatesByPopulationAsc();
    List<State> getStatesByPopulationDesc();

    /* area km */
    List<State> getStatesByAreaKmGreaterThanEqual(double area);
    List<State> getStatesByAreaKmLessThanEqual(double area);
    List<State> getStateByAreaKmAsc();
    List<State> getStateByAreaKmDesc();

    
    /* area Mile */
    List<State> getStatesByAreaMileGreaterThanEqual(double area);
    List<State> getStatesByAreaMileLessThanEqual(double area);
    List<State> getStateByAreaMileAsc();
    List<State> getStateByAreaMileDesc();
}
