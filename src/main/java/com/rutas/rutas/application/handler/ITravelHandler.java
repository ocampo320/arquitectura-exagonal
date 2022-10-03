package com.rutas.rutas.application.handler;

import com.rutas.rutas.application.dto.TravelRequest;
import com.rutas.rutas.application.dto.TravelResponse;
import com.rutas.rutas.domain.model.Routes;
import com.rutas.rutas.domain.model.Travel;

import java.util.List;

public interface ITravelHandler   {
    void createTravel(TravelRequest travel);
    List<TravelResponse> showTravel();
}
