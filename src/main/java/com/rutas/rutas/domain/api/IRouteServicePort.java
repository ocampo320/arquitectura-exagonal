package com.rutas.rutas.domain.api;

import com.rutas.rutas.domain.model.Routes;

import java.util.List;

public interface IRouteServicePort {
    Routes createRoute(Routes routes);
    List<Routes> showRoute();
}
