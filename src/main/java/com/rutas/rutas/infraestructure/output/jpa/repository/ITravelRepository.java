package com.rutas.rutas.infraestructure.output.jpa.repository;

import com.rutas.rutas.infraestructure.output.jpa.entity.TravelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITravelRepository extends JpaRepository<TravelEntity,Long> {
}
