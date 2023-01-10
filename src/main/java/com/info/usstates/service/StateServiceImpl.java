package com.info.usstates.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.usstates.dao.StateRepository;
import com.info.usstates.entity.State;

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
        
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
            
        } catch (ParseException e) {
            
            e.printStackTrace();
        }
        return stateRepository.findAllByAdmissionDateAfter(date1);
    }

    @Override
    public List<State> getStatesBeforeAdmissionDate(String date) {
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
            
        } catch (ParseException e) {
            
            e.printStackTrace();
        }
        return stateRepository.findAllByAdmissionDateBefore(date1);
    }
    
}
