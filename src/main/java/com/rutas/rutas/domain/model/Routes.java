package com.rutas.rutas.domain.model;

import java.util.ArrayList;

public class Routes {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNeighborhoods() {
        return neighborhoods;
    }

    public void setNeighborhoods(String neighborhoods) {
        this.neighborhoods = neighborhoods;
    }

    private Long id;
    private String neighborhoods;

    public Routes(Long id, String neighborhoods) {
        this.id = id;
        this.neighborhoods = neighborhoods;
    }
}
