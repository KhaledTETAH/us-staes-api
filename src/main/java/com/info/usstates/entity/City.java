package com.info.usstates.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "city")
public class City {
    
    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "state_code")
    private String stateCode;

    @Column(name = "state_name")
    private String stateName;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "latitude")
    private float lat;

    @Column(name = "longitude")
    private float lng;

    @Column(name = "population")
    private Double population;

    @Column(name = "density")
    private float density;

    @Column(name = "timezone")
    private String timezone;

    
}
