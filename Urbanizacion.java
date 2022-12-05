
package com.mycompany.sistemaingreso;

import java.util.ArrayList;
import java.util.Random;


public class Urbanizacion {
    
    
    private String nombreUrb;

    public String getNombreUrb() {
        return nombreUrb;
    }

    public void setNombreUrb(String nombreUrb) {
        this.nombreUrb = nombreUrb;
    }

    public int getEtapaUrb() {
        return etapaUrb;
    }

    public void setEtapaUrb(int etapaUrb) {
        this.etapaUrb = etapaUrb;
    }

    public String getEmailAdmin() {
        return emailAdmin;
    }

    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }

    public String getDireccionUrb() {
        return direccionUrb;
    }

    public void setDireccionUrb(String direccionUrb) {
        this.direccionUrb = direccionUrb;
    }

    public String getConstructoraUrb() {
        return constructoraUrb;
    }

    public void setConstructoraUrb(String constructoraUrb) {
        this.constructoraUrb = constructoraUrb;
    }

    public ColaboradorUrb getAdmin() {
        return admin;
    }

    public void setAdmin(ColaboradorUrb admin) {
        this.admin = admin;
    }
    private int etapaUrb;
    private String emailAdmin;
    private String direccionUrb;
    private String constructoraUrb;
    private ColaboradorUrb admin;
    Urbanizacion(String nombreUrb, int etapaUrb, String emailAdmin, String direccionUrb, String constructoraUrb, ColaboradorUrb admin) {
        this.nombreUrb = nombreUrb;
        this.etapaUrb = etapaUrb;
        this.emailAdmin = emailAdmin;
        this.direccionUrb = direccionUrb;
        this.constructoraUrb = constructoraUrb;
        this.admin=admin;
        
    }
  

    //se selecciona al administrador
    
    
    
    
    public void modificarInfoUrb(String nombreUrb, int etapa, String emailAdmin,
            String direccion, String constructora, String admin,ArrayList<ColaboradorUrb> empleados){
        
        this.nombreUrb= nombreUrb;
        this.etapaUrb=etapa;
        this.emailAdmin=emailAdmin;
        this.direccionUrb=direccion;
        this.constructoraUrb=constructora;
        this.admin=seleccionarAdmin(empleados);
        
    }

    @Override
    public String toString() {
        return "Nombre: "+nombreUrb+"\nEtapa: "+etapaUrb+
                "\nEmail administracion: "+emailAdmin+"\nDireccion: "+direccionUrb+
                "\nConstructora: "+constructoraUrb+"\nAdministrador: "+admin.getNombreEmpleado();
    }
    public  void mostrarinformacion(){
        System.out.println(toString());
    }
    
    
    //El administrador se lo selecciona entre los colaboradores registrados.
    
    public ColaboradorUrb seleccionarAdmin(ArrayList<ColaboradorUrb> empleados){
        Random rd =new Random();
        int n= rd.nextInt(empleados.size());
        
        return empleados.get(n);
    

}

  
    
    
    
    
    


}
