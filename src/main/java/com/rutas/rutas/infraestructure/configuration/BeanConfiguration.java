package com.rutas.rutas.infraestructure.configuration;

import com.rutas.rutas.domain.api.IRouteServicePort;
import com.rutas.rutas.domain.api.ITravelServicePort;
import com.rutas.rutas.domain.spi.IRoutePersistencePort;
import com.rutas.rutas.domain.spi.ITravelPersistence;
import com.rutas.rutas.domain.usecase.RouteUseCase;
import com.rutas.rutas.domain.usecase.TravelUseCase;
import com.rutas.rutas.infraestructure.output.jpa.adapter.RouteJpaAdapter;
import com.rutas.rutas.infraestructure.output.jpa.adapter.TravelJpaAdapter;
import com.rutas.rutas.infraestructure.output.jpa.mapper.RouteEntityMapper;
import com.rutas.rutas.infraestructure.output.jpa.mapper.TravelEntityMapper;
import com.rutas.rutas.infraestructure.output.jpa.repository.IRouteRepository;
import com.rutas.rutas.infraestructure.output.jpa.repository.ITravelRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class BeanConfiguration {
    private final ITravelRepository travelRepository;
    private final TravelEntityMapper travelEntityMapper;
    private final IRouteRepository routeRepository;
    private final RouteEntityMapper routeEntityMapper;


    @Bean
    public ITravelPersistence travelPersistencePort() {
        return new TravelJpaAdapter(travelRepository, travelEntityMapper);
    }

@Bean
    public ITravelServicePort travelServicesPort(){
    return  new TravelUseCase( travelPersistencePort());

    }

    @Bean
    public IRoutePersistencePort routePersistencePort() {
        return new RouteJpaAdapter(routeRepository, routeEntityMapper);
    }

    @Bean
    public IRouteServicePort routeServicesPort(){
        return  new RouteUseCase( routePersistencePort());

    }

}
