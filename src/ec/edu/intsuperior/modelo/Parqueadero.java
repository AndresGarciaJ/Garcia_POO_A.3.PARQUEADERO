/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author USER
 */
public class Parqueadero {
    
    private Integer idParqueadero;
    private String ubicacion;
    private Integer capacidad;
    private String nombreParqueadero;
    private Double tarifa;

    public Parqueadero() {
    }

    public Parqueadero(Integer idParqueadero, String ubicacion, Integer capacidad, String nombreParqueadero, Double tarifa) {
        this.idParqueadero = idParqueadero;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.nombreParqueadero = nombreParqueadero;
        this.tarifa = tarifa;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(Integer idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombreParqueadero() {
        return nombreParqueadero;
    }

    public void setNombreParqueadero(String nombreParqueadero) {
        this.nombreParqueadero = nombreParqueadero;
    }
    
    
}
