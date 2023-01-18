package com.info.usstates.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.usstates.dao.StateRepository;
import com.info.usstates.entity.State;
import com.info.usstates.utility.StateUtility;

@Service
public class StateServiceImpl implements StateService {
    
    @Autowired
    private StateRepository stateRepository;

    @Override
    public List<State> getAllStates() {
        
        return stateRepository.findAll();
    }

    @Override
    public Optional<State> getStateById(int id) {
        
        return stateRepository.findById(id);
    }

    @Override
    public List<State> getStateByName(String name) {
        
        return stateRepository.findAllByName(name);
    }

    @Override
    public List<State> getStateByCode(String code) {
        
        return stateRepository.findAllByCode(code);
    }

    @Override
    public List<State> getStatesAfterAdmissionDate(String date) {
        
        return stateRepository.findAllByAdmissionDateAfter(StateUtility.stringToDate(date));
    }

    @Override
    public List<State> getStatesBeforeAdmissionDate(String date) {
        
        return stateRepository.findAllByAdmissionDateBefore(StateUtility.stringToDate(date));
    }

    @Override
    public List<State> getStatesByOrderByAdmissionDateAsc() {
        
        return stateRepository.findAllByOrderByAdmissionDateAsc();
    }

    @Override
    public List<State> getStatesByOrderByAdmissionDateDesc() {
        
        return stateRepository.findAllByOrderByAdmissionDateDesc();
    }


    @Override
    public List<State> getStatesByPopulationGreaterThanEqual(double p) {
        
        return stateRepository.findAllByPopulationGreaterThanEqual(p);
    }

    @Override
    public List<State> getStatesByPopulationLessThanEqual(double p) {
        
        return stateRepository.findAllByPopulationLessThanEqual(p);
    }

    @Override
    public List<State> getStatesByPopulationAsc() {
        
        return stateRepository.findAllByOrderByPopulationAsc();
    }

    @Override
    public List<State> getStatesByPopulationDesc() {
        
        return stateRepository.findAllByOrderByPopulationDesc();
    }

    @Override
    public List<State> getStatesByAreaKmGreaterThanEqual(double area) {
        
        return stateRepository.findAllByAreaKmGreaterThanEqual(area);
    }

    @Override
    public List<State> getStatesByAreaKmLessThanEqual(double area) {
        
        return stateRepository.findAllByAreaKmLessThanEqual(area);
    }

    @Override
    public List<State> getStateByAreaKmAsc() {
        
        return stateRepository.findAllByOrderByAreaKmAsc();
    }

    @Override
    public List<State> getStateByAreaKmDesc() {
        
        return stateRepository.findAllByOrderByAreaKmDesc();
    }

    @Override
    public List<State> getStatesByAreaMileGreaterThanEqual(double area) {
        
        return stateRepository.findAllByAreaMileGreaterThanEqual(area);
    }

    @Override
    public List<State> getStatesByAreaMileLessThanEqual(double area) {
        
        return stateRepository.findAllByAreaMileLessThanEqual(area);
    }

    @Override
    public List<State> getStateByAreaMileAsc() {
        
        return stateRepository.findAllByOrderByAreaMileAsc();
    }

    @Override
    public List<State> getStateByAreaMileDesc() {
        
        return stateRepository.findAllByOrderByAreaMileDesc();
    }
    
}
