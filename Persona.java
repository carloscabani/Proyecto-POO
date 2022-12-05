/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemaingreso;

/**
 *
 * @author gstevs
 */
public class Persona {
    // esta clase contiene la informacion de la persona 
    private String cedula;
    private String nombre;
    private String telefono;
    private String emai;

    public Persona(String cedula, String nombre, String telefono, String emai) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.emai = emai;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }
    
    
}
