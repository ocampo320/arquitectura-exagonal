package com.rutas.rutas.domain.spi;

import com.rutas.rutas.domain.model.Travel;

import java.util.List;

public interface ITravelPersistence {
    void createTravel(Travel travel);
    List<Travel> showTravel();
}
