package com.info.usstates.service;

import java.util.List;
import java.util.Optional;

import com.info.usstates.entity.State;

public interface StateService {

    List<State> getAllStates();
    Optional<State> getStateById(int id);
    List<State> getStateByName(String name);
    List<State> getStateByCode(String code);
    List<State> getStatesAfterAdmissionDate(String date);
    List<State> getStatesBeforeAdmissionDate(String date);
    List<State> getStatesByOrderByAdmissionDateAsc();
    List<State> getStatesByOrderByAdmissionDateDesc();
    List<State> getStatesByPopulationGreaterThanEqual(double p);
    List<State> getStatesByPopulationLessThanEqual(double p);
    List<State> getStatesByPopulationAsc();
    List<State> getStatesByPopulationDesc();
}
