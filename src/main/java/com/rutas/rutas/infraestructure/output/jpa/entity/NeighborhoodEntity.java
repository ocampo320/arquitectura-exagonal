package com.rutas.rutas.infraestructure.output.jpa.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "neighborhood")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NeighborhoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String neighborhoods;
}
