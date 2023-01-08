package com.info.usstates.service;

import java.util.List;

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
    
}
