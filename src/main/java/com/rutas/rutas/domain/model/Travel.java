package com.rutas.rutas.domain.model;

import java.sql.Timestamp;

public class Travel {

    private Long id;
    private Timestamp Schedule;
    private int quotas;
    private Long routeId;

    public Travel(Long id, Timestamp schedule, int quotas, Long routeId) {
        this.id = id;
        Schedule = schedule;
        this.quotas = quotas;
        this.routeId = routeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getSchedule() {
        return Schedule;
    }

    public void setSchedule(Timestamp schedule) {
        Schedule = schedule;
    }

    public int getQuotas() {
        return quotas;
    }

    public void setQuotas(int quotas) {
        this.quotas = quotas;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }
}
