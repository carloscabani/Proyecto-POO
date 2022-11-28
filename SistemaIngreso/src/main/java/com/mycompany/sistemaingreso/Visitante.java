
package com.mycompany.sistemaingreso;


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
                "\nEmpresa: "+empresaVisitante+"\nHistorial de Sanciones: "+historialSancion);
    }
//Se podrán agregar visitantes y editar todos los campos menos la cédula.  
    
    
}
