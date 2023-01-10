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
}
