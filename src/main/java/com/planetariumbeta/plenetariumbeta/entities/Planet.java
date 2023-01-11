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
@Table(name = "planets")
public class Planet {
    
    @Id
    @Column(name = "id")
    private int planetId;

    @Column(name = "name")
    private String planetName;

    @Column(name = "ownerid")
    private int ownerId;
    
    

}
