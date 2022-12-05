
package com.mycompany.sistemaingreso;

import java.util.ArrayList;


public class Visitante extends Persona{
    
  
    public String empresaVisitante;// si es que es repartidor
    public String historialSancion;

    public Visitante(String cedula, String nombre, String telefono, String emai,String historialSancion,String empresaVisitante) {
        
        super(cedula, nombre, telefono, emai);
        this.empresaVisitante=empresaVisitante;
        this.historialSancion=historialSancion;
    }
    public Visitante(String cedula, String nombre, String telefono, String emai,String historialSancion) {
        
        super(cedula, nombre, telefono, emai);
        this.empresaVisitante=null;
        this.historialSancion=historialSancion;

    }

    public String getEmpresaVisitante() {
        return empresaVisitante;
    }

    public void setEmpresaVisitante(String empresaVisitante) {
        this.empresaVisitante = empresaVisitante;
    }

    public String getHistorialSancion() {
        return historialSancion;
    }

    public void setHistorialSancion(String historialSancion) {
        this.historialSancion = historialSancion;
    }
    

    @Override
    public String toString() {
        if (empresaVisitante!=null){
            return "Nombre: "+super.getNombre()+"\nCedula: "+super.getCedula()+
                "\nTelefono: "+super.getTelefono()+"\nEmail: "+super.getEmai()+
                "\nHistorial de Sanciones: "+historialSancion + "\nempresaVisitante=" + empresaVisitante + ", \nhistorialSancion=" + historialSancion + '}';
        }
        else{
            return "Nombre: "+super.getNombre()+"\nCedula: "+super.getCedula()+
                "\nTelefono: "+super.getTelefono()+"\nEmail: "+super.getEmai()+
                "\nHistorial de Sanciones: "+historialSancion +  ", \nhistorialSancion=" + historialSancion + '}';
        }
        
    }
    


    
    
    

//Se podrán agregar visitantes y editar todos los campos menos la cédula.  
    
    public void agregarVisitantes(ArrayList<String> visitantes, String visitante){
        visitantes.add(visitante);
    }
    
//en caso de que sea repartidor
    public void setEditarVisitante(String nombre, String telefono, String email, 
            String empresa, String historial){
    
        super.setNombre(nombre);
        super.setEmai(email);
        super.setTelefono(telefono);
        this.empresaVisitante=empresa;
        this.historialSancion=historial;
    
    }
    
//en caso de que no sea repartidor
    public void setEditarVisitante(String nombre, String telefono, String email,String historial){
    
        
        super.setNombre(nombre);
        super.setEmai(email);
        super.setTelefono(telefono);
        
        this.historialSancion=historial;
    
    }
    
    
    
}
