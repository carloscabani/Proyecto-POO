
package com.mycompany.sistemaingreso;

import java.util.ArrayList;


public class Visitante {
    
    public String cedulaVisitante;
    public String nombreVisitante;
    public String telefonoVisitante;
    public String emailVisitante;
    public String empresaVisitante;// si es que es repartidor
    public String historialSancion;
    

    public void mostrarInfoVisitante(){
        System.out.println("Nombre: "+nombreVisitante+"\nCedula: "+cedulaVisitante+
                "\nTelefono: "+telefonoVisitante+"\nEmail: "+emailVisitante+
                "\nHistorial de Sanciones: "+historialSancion);
    }
    
    
    
     public void mostrarInfoRepartidor(){
        System.out.println("Nombre: "+nombreVisitante+"\nCedula: "+cedulaVisitante+
                "\nTelefono: "+telefonoVisitante+"\nEmail: "+emailVisitante+
                "\nEmpresa: "+empresaVisitante+"\nHistorial de Sanciones: "+historialSancion);
    }
//Se podrán agregar visitantes y editar todos los campos menos la cédula.  
    
    public void agregarVisitantes(ArrayList<String> visitantes, String visitante){
        visitantes.add(visitante);
    }
    
//en caso de que sea repartidor
    public void setEditarRepartidor(String nombre, String telefono, String email, 
            String empresa, String historial){
    
        this.nombreVisitante=nombre;
        this.emailVisitante=email;
        this.telefonoVisitante=telefono;
        this.empresaVisitante=empresa;
        this.historialSancion=historial;
    
    }
    
//en caso de que no sea repartidor
    public void setEditarVisitante(String nombre, String telefono, String email,String historial){
    
        this.nombreVisitante=nombre;
        this.emailVisitante=email;
        this.telefonoVisitante=telefono;
        this.historialSancion=historial;
    
    }
    
    
    
}
