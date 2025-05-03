package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name="ALUMNOS")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "login", unique = true, nullable = false)
    private Integer login;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    
    @Column(name = "area")
    private Integer area;

    @Column(name = "zona")
    private Integer zona;

    @Column(name = "puesto")
    private Integer puesto;

    // Getters y Setters
       // === GETTERS ===
       public Integer getLogin() {
        return login;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getArea() {
        return area;
    }

    public Integer getZona() {
        return zona;
    }

    public Integer getPuesto() {
        return puesto;
    }

    // === SETTERS ===
    public void setLogin(Integer login) {
        this.login = login;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }

    public void setPuesto(Integer puesto) {
        this.puesto = puesto;
    }
}