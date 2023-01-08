package com.info.usstates.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.usstates.entity.State;

public interface StateRepository extends JpaRepository<State, Integer>{
    
}
