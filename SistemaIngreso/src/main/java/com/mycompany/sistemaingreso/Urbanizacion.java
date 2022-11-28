
package com.mycompany.sistemaingreso;


public class Urbanizacion {
    
    
    public String nombreUrb;
    public int etapaUrb;
    public String emailAdmin;
    public String direccionUrb;
    public String constructoraUrb;
    public String admin;


    public void modificarInfoUrb(String nombreUrb, int etapa, String emailAdmin,
            String direccion, String constructora, String admin){
        
        this.nombreUrb= nombreUrb;
        this.etapaUrb=etapa;
        this.emailAdmin=emailAdmin;
        this.direccionUrb=direccion;
        this.constructoraUrb=constructora;
        this.admin=admin;
        
    }
    
    public void mostrarInfoUrb(){
        System.out.println("Nombre: "+nombreUrb+"\nEtapa: "+etapaUrb+
                "\nEmail administracion: "+emailAdmin+"\nDireccion: "+direccionUrb+
                "\nConstructora: "+constructoraUrb+"\nAdministrador: "+admin);
        
    
    
    
    }
    //El administrador se lo selecciona entre los colaboradores registrados.
    
    
    
    
    


}
