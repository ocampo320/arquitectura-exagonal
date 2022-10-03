package com.rutas.rutas.infraestructure.output.jpa.mapper;

import com.rutas.rutas.domain.model.Travel;
import com.rutas.rutas.infraestructure.output.jpa.entity.TravelEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface TravelEntityMapper {
    TravelEntity toEntity(Travel travel);

    Travel toTravel(TravelEntity travelEntity);

    List<Travel> toTravelList(List<TravelEntity> travelEntityList);
}
