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
public class Vehiculo {
 
    private String idPlaca;
    private Propietario Propietario;
    private String fechaFabricacion;
    private String color;
    private String marca;
    private Double precio;
    private String chasis;
    private tipoVehiculo tipoVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String idPlaca, Propietario Propietario, String fechaFabricacion, String color, String marca, Double precio, String chasis, tipoVehiculo tipoVehiculo) {
        this.idPlaca = idPlaca;
        this.Propietario = Propietario;
        this.fechaFabricacion = fechaFabricacion;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
        this.chasis = chasis;
        this.tipoVehiculo = tipoVehiculo;
    }

    public tipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(tipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getIdPlaca() {
        return idPlaca;
    }

    public void setIdPlaca(String idPlaca) {
        this.idPlaca = idPlaca;
    }

    public Propietario getPropietario() {
        return Propietario;
    }

    public void setPropietario(Propietario Propietario) {
        this.Propietario = Propietario;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }
    
    
}
