package com.rutas.rutas.domain.api;

import com.rutas.rutas.domain.model.Routes;
import com.rutas.rutas.domain.model.Travel;

import java.util.List;

public interface ITravelServicePort {
    void createTravel(Travel routes);
    List<Travel> showTravel();
}
