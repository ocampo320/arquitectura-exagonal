package com.rutas.rutas.domain.usecase;

import com.rutas.rutas.domain.api.ITravelServicePort;
import com.rutas.rutas.domain.model.Travel;
import com.rutas.rutas.domain.spi.ITravelPersistence;

import java.util.List;

public class TravelUseCase implements ITravelServicePort {
    private final ITravelPersistence travelPersistence;

    public TravelUseCase(ITravelPersistence travelPersistence) {
        this.travelPersistence = travelPersistence;
    }

    @Override
    public void createTravel(Travel travel) {
        travelPersistence.createTravel(travel);

    }

    @Override
    public List<Travel> showTravel() {
        return travelPersistence.showTravel();
    }
}
