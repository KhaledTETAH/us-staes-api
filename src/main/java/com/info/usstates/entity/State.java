package com.info.usstates.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "state")
public class State {

    
   

    @Id
    @Column(name = "admission_number")
    @JsonIgnore
    private int admissionNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "nickname") 
    private String nickname;

    @Column(name = "admission_date")
    private Date admissionDate;

    @Column(name = "capital_city")
    private String capitalCity;
    
    @Column(name = "capital_url")
    private String capitalUrl;

    @Column(name = "population")
    private double population;

    @Column(name = "state_flag_url")
    private String stateFlagUrl;

    @Column(name = "state_seal_url")
    private String stateSealUrl;

    @Column(name = "map_image_url")
    private String mapIamgeUrl;

    @Column(name = "website")
    private String websiteUrl;

    @Column(name = "area_mile")
    private double areaMile;

    @Column(name = "area_km")
    private double areaKm;
}
