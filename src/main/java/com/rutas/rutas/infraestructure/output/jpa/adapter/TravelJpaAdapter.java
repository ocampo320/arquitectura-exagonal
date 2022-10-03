package com.rutas.rutas.infraestructure.output.jpa.adapter;

import com.rutas.rutas.domain.model.Travel;
import com.rutas.rutas.domain.spi.ITravelPersistence;
import com.rutas.rutas.infraestructure.output.jpa.entity.TravelEntity;
import com.rutas.rutas.infraestructure.output.jpa.mapper.TravelEntityMapper;
import com.rutas.rutas.infraestructure.output.jpa.repository.ITravelRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TravelJpaAdapter implements ITravelPersistence {

    private final ITravelRepository travelRepository;
    private final TravelEntityMapper travelEntityMapper;

    @Override
    public void createTravel(Travel travel) {
        travelRepository.save(travelEntityMapper.toEntity(travel));

    }

    @Override
    public List<Travel> showTravel() {
        List<TravelEntity> travelEntityList = travelRepository.findAll();
        return travelEntityMapper.toTravelList(travelEntityList);
    }
}
