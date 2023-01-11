package com.planetariumbeta.plenetariumbeta.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "moons")
public class Moon {
    
    @Id
    @Column(name = "id")
    private int moonId;

    @Column(name = "name")
    private String moonName;

    @Column(name = "myplanetid")
    private int myPlanetId;

}
