package com.rutas.rutas.application.dto;

import com.rutas.rutas.domain.model.Routes;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class TravelRequest {
    private Timestamp Schedule;
    private int quotas;
    private RouteDto route;

}
