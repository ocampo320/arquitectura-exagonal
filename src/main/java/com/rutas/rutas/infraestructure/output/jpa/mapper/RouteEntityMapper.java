package com.rutas.rutas.infraestructure.output.jpa.mapper;


import com.rutas.rutas.domain.model.Routes;
import com.rutas.rutas.infraestructure.output.jpa.entity.RouteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface RouteEntityMapper {
    RouteEntity toEntity(Routes routes);

    Routes toRoutes(RouteEntity routesEntity);

    List<Routes> toTravelList(List<RouteEntity> routeEntityList);
}
