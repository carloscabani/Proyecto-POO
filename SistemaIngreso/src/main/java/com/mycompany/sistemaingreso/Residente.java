
package com.mycompany.sistemaingreso;

import java.util.ArrayList;


public class Residente extends Persona{
    
    public EstadoPersona estadoResidente;//activo o inactivo
    public String villaResidente;
    public int cantidadPersonas;
    public Urbanizacion urbanizacion;

    public EstadoPersona getEstadoResidente() {
        return estadoResidente;
    }

    public void setEstadoResidente(EstadoPersona estadoResidente) {
        this.estadoResidente = estadoResidente;
    }

    public String getVillaResidente() {
        return villaResidente;
    }

    public void setVillaResidente(String villaResidente) {
        this.villaResidente = villaResidente;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Urbanizacion getUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(Urbanizacion urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public Residente(EstadoPersona estadoResidente, String villaResidente, int cantidadPersonas, Urbanizacion urbanizacion, String cedula, String nombre, String telefono, String emai) {
        super(cedula, nombre, telefono, emai);
        this.estadoResidente = estadoResidente;
        this.villaResidente = villaResidente;
        this.cantidadPersonas = cantidadPersonas;
        this.urbanizacion = urbanizacion;
    }

    

    @Override
    public String toString() {
        return "Nombre: "+super.getNombre()+"\nCedula: "+super.getCedula()+
                "\nTelefono: "+super.getTelefono()+"\nEmail: "+super.getEmai()+
                "\nEstado: "+estadoResidente+"\nVilla: "+villaResidente+
                "\nCantidad de personas: "+cantidadPersonas+"\nUrbanizacion: "+urbanizacion.getNombreUrb()+"\n";
    }
    
    
    
public void mostrarInfoResidente(){
        System.out.println();
}
/*mz no es definido
Se podrán agregar residentes, editar y eliminar. La acción de eliminar lo que hará es cambiar
el estado a Inactivo*/

public void agregarResidentes(ArrayList<String> residentes, String residente){

    residentes.add(residente);

}







}

