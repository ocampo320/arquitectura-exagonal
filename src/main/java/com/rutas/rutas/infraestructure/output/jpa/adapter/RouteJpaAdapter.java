package com.rutas.rutas.infraestructure.output.jpa.adapter;

import com.rutas.rutas.domain.model.Routes;
import com.rutas.rutas.domain.spi.IRoutePersistencePort;
import com.rutas.rutas.infraestructure.output.jpa.entity.RouteEntity;
import com.rutas.rutas.infraestructure.output.jpa.mapper.RouteEntityMapper;
import com.rutas.rutas.infraestructure.output.jpa.repository.IRouteRepository;
import lombok.AllArgsConstructor;

import java.util.List;
@AllArgsConstructor
public class RouteJpaAdapter implements IRoutePersistencePort {
    final private IRouteRepository routeRepository;
    final private RouteEntityMapper routeEntityMapper;

    @Override
    public void createRoute(Routes routes) {
        routeRepository.save(routeEntityMapper.toEntity(routes));
    }

    @Override
    public List<Routes> showRoute() {
        List<RouteEntity> routeEntityList = routeRepository.findAll();
        return routeEntityMapper.toTravelList(routeEntityList);
    }
}
