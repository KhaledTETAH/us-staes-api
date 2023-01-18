package com.info.usstates.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.usstates.entity.State;
import com.info.usstates.service.StateServiceImpl;


@RestController
@RequestMapping("/api/states")
public class StateController {

    @Autowired
    private StateServiceImpl stateService;

    @GetMapping
    public List<State> getAlStates(){
        return stateService.getAllStates();
    }

    @GetMapping(value = "/id/{id}")
    public State getStateById(@PathVariable(value = "id") int id){
        return stateService.getStateById(id).get();
    }

    @GetMapping(value = "/name/{name}")
    public List<State> getStateByName(@PathVariable(value = "name") String name){
        return stateService.getStateByName(name);
    }

    @GetMapping(value = "/code/{code}")
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

    @GetMapping(value = "/admission-date-desc")
    public List<State> getStatesByOrderByAdmissionDateDesc(){
        return stateService.getStatesByOrderByAdmissionDateDesc();
    }

    @GetMapping(value = "/population-greater-than/{p}")
    public List<State> getStatesByPopulationGreaterThanEqual(@PathVariable(value = "p") double p){
        return stateService.getStatesByPopulationGreaterThanEqual(p);
    }

    @GetMapping(value = "/population-less-than/{p}")
    public List<State> getStatesByPopulationLessThanEqual(@PathVariable(value = "p") double p){
        return stateService.getStatesByPopulationLessThanEqual(p);
    }

    @GetMapping(value = "/population-asc")
    public List<State> getStatesByPopulationAsc(){
        return stateService.getStatesByPopulationAsc();
    }

    @GetMapping(value = "/population-desc")
    public List<State> getStatesByPopulationDesc(){
        return stateService.getStatesByPopulationDesc();
    }

    @GetMapping(value = "/area-km-greater-than/{area}")
    public List<State> getStatesByAreaKmGreaterThanEqual(@PathVariable(value = "area") double area){
        return stateService.getStatesByAreaKmGreaterThanEqual(area);
    }

    @GetMapping(value = "/area-km-less-than/{area}")
    public List<State> getStatesByAreaKmLessThanEqual(@PathVariable(value = "area") double area){
        return stateService.getStatesByAreaKmLessThanEqual(area);
    }

    @GetMapping(value = "/area-km-asc")
    public List<State> getStatesByAreaKmAsc(){
        return stateService.getStateByAreaKmAsc();
    }

    @GetMapping(value = "/area-km-desc")
    public List<State> getStatesByAreaKmDesc(){
        return stateService.getStateByAreaKmDesc();
    }

    @GetMapping(value = "/area-mile-greater-than/{area}")
    public List<State> getStatesByAreaMileGreaterThanEqual(@PathVariable(value = "area") double area){
        return stateService.getStatesByAreaMileGreaterThanEqual(area);
    }

    @GetMapping(value = "/area-mile-less-than/{area}")
    public List<State> getStatesByAreaMileLessThanEqual(@PathVariable(value = "area") double area){
        return stateService.getStatesByAreaMileLessThanEqual(area);
    }

    @GetMapping(value = "/area-mile-asc")
    public List<State> getStatesByAreaMileAsc(){
        return stateService.getStateByAreaMileAsc();
    }

    @GetMapping(value = "/area-mile-desc")
    public List<State> getStatesByAreaMileDesc(){
        return stateService.getStateByAreaMileDesc();
    }
}
