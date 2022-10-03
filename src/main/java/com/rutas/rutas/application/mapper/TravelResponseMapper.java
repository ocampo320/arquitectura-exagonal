package com.rutas.rutas.application.mapper;


import com.rutas.rutas.application.dto.RouteDto;
import com.rutas.rutas.application.dto.TravelRequest;
import com.rutas.rutas.application.dto.TravelResponse;
import com.rutas.rutas.domain.model.Routes;
import com.rutas.rutas.domain.model.Travel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,uses = {RouteDtoMapper.class})
public interface TravelResponseMapper {
    Travel toTravel(TravelRequest travelRequest);

    RouteDtoMapper INSTANCE = Mappers.getMapper(RouteDtoMapper.class);


    default List<TravelResponse> toResponseList(List<Travel> travelList, List<Routes> routeList) {
        return travelList.stream()
                .map(travel -> {
                    TravelResponse travelResponse = new TravelResponse();
                    travelResponse.setQuotas(travel.getQuotas());
                    travelResponse.setRoutes(INSTANCE.toDto(routeList.stream().filter(type -> type.getId().equals(travel.getRouteId())).findFirst().orElse(null)));
                    return travelResponse;
                }).collect(Collectors.toList());
    }

}
