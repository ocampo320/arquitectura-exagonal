package com.rutas.rutas.application.handler;

import com.rutas.rutas.application.dto.TravelRequest;
import com.rutas.rutas.application.dto.TravelResponse;
import com.rutas.rutas.application.mapper.RouteDtoMapper;
import com.rutas.rutas.application.mapper.TravelRequestMapper;
import com.rutas.rutas.application.mapper.TravelResponseMapper;
import com.rutas.rutas.domain.api.IRouteServicePort;
import com.rutas.rutas.domain.api.ITravelServicePort;
import com.rutas.rutas.domain.model.Routes;
import com.rutas.rutas.domain.model.Travel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
public class TravelHandler implements  ITravelHandler{
private final ITravelServicePort travelServicePort;
private final IRouteServicePort routeServicePort;
private final TravelRequestMapper travelRequestMapper;
private final TravelResponseMapper travelResponseMapper;
private final RouteDtoMapper routeDtoMapper;


    @Override
    public void createTravel(TravelRequest travelRequest) {
        Routes routes=routeServicePort.createRoute(travelRequestMapper.toRoute(travelRequest));
         Travel travel=travelRequestMapper.toTravel(travelRequest);

         travel.setRouteId(routes.getId());
         travelServicePort.createTravel(travel);
         routeServicePort.createRoute(new Routes(null,travelRequest.getRoute().getNeighborhoods()));
    }

    @Override
    public List<TravelResponse> showTravel() {
        return travelResponseMapper.toResponseList(travelServicePort.showTravel(),routeServicePort.showRoute());
    }
}
