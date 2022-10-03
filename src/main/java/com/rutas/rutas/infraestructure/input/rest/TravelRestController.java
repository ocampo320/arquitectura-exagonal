package com.rutas.rutas.infraestructure.input.rest;


import com.rutas.rutas.application.dto.TravelRequest;
import com.rutas.rutas.application.dto.TravelResponse;
import com.rutas.rutas.application.handler.ITravelHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/travel/")
@RequiredArgsConstructor
public class TravelRestController {

    private final ITravelHandler iTravelHandler;




    @PostMapping("/create")
    public ResponseEntity<Void> createTravel(@RequestBody TravelRequest travelRequest) {
        iTravelHandler.createTravel(travelRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/")
    public ResponseEntity<List<TravelResponse>> getAllTravel() {
        return ResponseEntity.ok(iTravelHandler.showTravel());
    }
}
