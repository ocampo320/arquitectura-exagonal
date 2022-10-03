package com.rutas.rutas.domain.spi;

import com.rutas.rutas.domain.model.Routes;

import java.util.List;

public interface IRoutePersistencePort {
    void createRoute(Routes routes);
    List<Routes> showRoute();
}
