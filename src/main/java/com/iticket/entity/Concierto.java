package com.iticket.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import java.sql.Date;


@Entity
@Table(name = "concierto")
public class Concierto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    
    @Column(name = "nombre_artista")
    private String nombre_artista;
    @Column(name = "costo")
    private int costo;
    @NotEmpty
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "capacidad")
    private int capacidad;
    @Column(name = "lugar")
    private String lugar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_artista() {
        return nombre_artista;
    }

    public void setNombre_artista(String nombre_artista) {
        this.nombre_artista = nombre_artista;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
}
