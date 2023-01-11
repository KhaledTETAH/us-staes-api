package com.info.usstates.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.usstates.entity.State;
import com.info.usstates.service.StateService;
import com.info.usstates.service.StateServiceImpl;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/states")
public class StateController {

    @Autowired
    private StateServiceImpl stateService;

    @GetMapping
    public List<State> getAlStates(){
        return stateService.getAllStates();
    }

    @GetMapping("/id/{id}")
    public State getStateById(@PathVariable(value = "id") int id){
        return stateService.getStateById(id).get();
    }

    @GetMapping("/name/{name}")
    public List<State> getStateByName(@PathVariable(value = "name") String name){
        return stateService.getStateByName(name);
    }

    @GetMapping("/code/{code}")
    public List<State> getStateByCode(@PathVariable(value = "code") String code){
        return stateService.getStateByCode(code);
    }

    @GetMapping(value="/admission-date-after/{dateAfter}")
    public List<State> getStatesAfterAdmissionDate(@PathVariable(name = "dateAfter") String dateAfter) {
        return stateService.getStatesAfterAdmissionDate(dateAfter);
    }

    @GetMapping(value="/admission-date-before/{dateBefore}")
    public List<State> getStatesBeforeAdmissionDate(@PathVariable(name = "dateBefore") String dateBefore) {
        return stateService.getStatesBeforeAdmissionDate(dateBefore);
    }
    
    @GetMapping(value = "/admission-date-asc")
    public List<State> getStatesByOrderByAdmissionDateAsc(){
        return stateService.getStatesByOrderByAdmissionDateAsc();
    }
}
