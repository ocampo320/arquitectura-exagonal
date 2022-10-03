package com.rutas.rutas.infraestructure.output.jpa.repository;

import com.rutas.rutas.infraestructure.output.jpa.entity.RouteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRouteRepository extends JpaRepository<RouteEntity,Long> {
}
