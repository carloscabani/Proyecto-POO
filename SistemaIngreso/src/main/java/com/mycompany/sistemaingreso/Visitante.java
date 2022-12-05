
package com.mycompany.sistemaingreso;

import java.util.ArrayList;
import java.util.Scanner;


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
    
    public static void mostrarInformacionVisitantes(ArrayList<Visitante> visitantes){
        int i=1;
        for (Visitante visita:visitantes){
            System.out.println(i+"..."+visita);
            i++;
        }
        
    }
    public static void agregarVisitante(ArrayList<Visitante> visitantes,String informacion,String empresa){
        String[] datos=informacion.split(informacion);
        //cedula,nombre,telefono,email,historialSancion
        Visitante nuevo=new Visitante(datos[0], datos[1], datos[2], datos[3], datos[4],empresa);
        visitantes.add(nuevo);
        
    }
    public static void modificarVisitante(ArrayList<Visitante> visitantes,int indice){
        
        Scanner sc=new Scanner(System.in);
        Visitante v=visitantes.get(indice);
        System.out.println("Que campo desea modificar?");
        System.out.println("1.- Nombre");
        System.out.println("2.- Telefono");
        System.out.println("3.- Email");
        System.out.println("4.- Empresa");
        System.out.println("5.- Agregar Sancion");
        System.out.print("Opcion:");
        int campo=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        switch (campo){
            
            case 1:
                System.out.print("Ingrese nombre:");
                String nombre=sc1.nextLine();
                v.setNombre(nombre);
                break;

                
            case 2:
                System.out.print("Ingrese Telefono:");
                String telefono=sc1.next();
                v.setTelefono(telefono);
                break;
            case 3:
                System.out.print("Ingrese Email:");
                String email=sc1.nextLine();
                v.setEmai(email);
                break;
            case 4:
                System.out.print("Ingrese empresa:");
                String empresa =sc1.nextLine();
                v.setEmpresaVisitante(empresa);
                break;
            case 5:
                System.out.println("Ingese descripcion de sanciones:");
                String sancion=sc1.nextLine();
                v.setHistorialSancion(v.getHistorialSancion()+" ,"+sancion);
                break;
            default:
                System.out.println("Opcion incorrecta...");
                break;
        }
        visitantes.set(indice,v);
        
        
    }
    
    
}
