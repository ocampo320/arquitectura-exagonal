package com.rutas.rutas.domain.usecase;

import com.rutas.rutas.domain.api.IRouteServicePort;
import com.rutas.rutas.domain.model.Routes;
import com.rutas.rutas.domain.spi.IRoutePersistencePort;

import java.util.List;

public class RouteUseCase implements IRouteServicePort {
    private final IRoutePersistencePort routePersistencePort;

    public RouteUseCase(IRoutePersistencePort iRoutePersistencePort) {
        this.routePersistencePort = iRoutePersistencePort;
    }

    @Override
    public Routes createRoute(Routes routes) {
        routePersistencePort.createRoute(routes);

        return routes;
    }

    @Override
    public List<Routes> showRoute() {
        return routePersistencePort.showRoute();
    }
}
