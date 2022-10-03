package com.rutas.rutas.application.mapper;


import com.rutas.rutas.domain.model.Routes;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface RouteDtoMapper {
    Routes toDto(Routes routes);
}
