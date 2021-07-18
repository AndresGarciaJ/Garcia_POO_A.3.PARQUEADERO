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
public class tipoVehiculo {
 
       private Integer idTipo;
    private String descripcionTpipo;

    public tipoVehiculo() {
    }

    public tipoVehiculo(Integer idTipo, String descripcionTpipo) {
        this.idTipo = idTipo;
        this.descripcionTpipo = descripcionTpipo;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescripcionTpipo() {
        return descripcionTpipo;
    }

    public void setDescripcionTpipo(String descripcionTpipo) {
        this.descripcionTpipo = descripcionTpipo;
    }

 
}
