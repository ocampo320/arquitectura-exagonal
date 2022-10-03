package com.rutas.rutas.application.mapper;


import com.rutas.rutas.application.dto.TravelRequest;
import com.rutas.rutas.domain.model.Routes;
import com.rutas.rutas.domain.model.Travel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface TravelRequestMapper {
    Travel toTravel(TravelRequest travelRequest);

    @Mapping(source = "travelRequest.route.neighborhoods",target ="neighborhoods" )
    Routes toRoute(TravelRequest travelRequest);




}
