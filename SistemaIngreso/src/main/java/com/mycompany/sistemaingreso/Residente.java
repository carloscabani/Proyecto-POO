
package com.mycompany.sistemaingreso;

import java.util.ArrayList;
import java.util.Scanner;


public class Residente extends Persona{
    
    public EstadoPersona estadoResidente;//activo o inactivo
    public String villaResidente;
    public String mz;
    public int cantidadPersonas;
    public Urbanizacion urbanizacion;

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

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

    public Residente(EstadoPersona estadoResidente, String villaResidente, String mz,int cantidadPersonas, Urbanizacion urbanizacion, String cedula, String nombre, String telefono, String emai) {
        super(cedula, nombre, telefono, emai);
        this.estadoResidente = estadoResidente;
        this.villaResidente = villaResidente;
        this.cantidadPersonas = cantidadPersonas;
        this.urbanizacion = urbanizacion;
        this.mz=mz;
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
public static void eliminarResidente(ArrayList<Residente> residentes,int indice){
        Residente r=residentes.get(indice);
        r.setEstadoResidente(EstadoPersona.INACTIVO);
        residentes.set(indice, r);
        
    }

public static void mostrarInformacionResidentes(ArrayList<Residente> residentes){
        int i=1;
        for(Residente residente:residentes){
            System.out.print(i+"..."+residente);
            i++;
            
        }
    }

public  static void modificarResidente(ArrayList<Residente> residentes,int indice){
        
        Scanner sc=new Scanner(System.in);
        Residente r=residentes.get(indice);
        System.out.println("Que campo desea modificar?");
        System.out.println("1.- Nombre");
        System.out.println("2.- Cedula");
        System.out.println("3.- Telefono");
        System.out.println("4.- Email");
        System.out.println("5.- Cantidad de personas");
        System.out.println("6.- Villa");
        System.out.print("Opcion:");
        int campo=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        switch (campo){
            
            case 1:
                System.out.print("Ingrese nombre:");
                String nombre=sc1.nextLine();
                r.setNombre(nombre);
                break;
            case 2:
                System.out.print("Ingrese cedula:");
                String cedula=sc1.nextLine();
                r.setCedula(cedula);
                break;
            case 3:
                System.out.print("Ingrese Telefono:");
                String telefono=sc1.next();
                r.setTelefono(telefono);
                break;
            case 4:
                System.out.print("Ingrese Email:");
                String email=sc1.nextLine();
                r.setEmai(email);
                break;
            case 5:
                System.out.print("Ingrese cantidad de persona:");
                int cantidad=sc1.nextInt();
                r.setCantidadPersonas(cantidad);
                break;
            default:
                System.out.println("Opcion incorrecta...");
                break;
        }
        residentes.set(indice,r);
        
    }

public static void agregarResidente(ArrayList<Residente> residentes,String datos,Urbanizacion urb){
        String[] info=datos.split(",");
        //villaResidente,cantidadPersonasQue viven con el resdiente,Cedula,Nombre,Telefonoelefono,Email
        String villaResidente=info[0];
        String mz=info[1];
        int cantidadPersonas= Integer.parseInt(info[2]);
        String cedula= info[3];
        String nombre=info[4];
        String telefono=info[5];
        String email=info[6];
        //String estadoResidente, String villaResidente, int cantidadPersonas, Urbanizacion urbanizacion, String cedula, String nombre, String telefono, String emai
        Residente residente=new Residente(EstadoPersona.ACTIVO, villaResidente,mz, cantidadPersonas, urb, cedula, nombre, telefono, email);
        residentes.add(residente);
        
        
    }



}

