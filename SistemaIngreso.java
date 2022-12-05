/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistemaingreso;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LEGION
 */
public class SistemaIngreso {
    private ArrayList<ColaboradorUrb> colaboradores=new ArrayList<ColaboradorUrb>();
    private ColaboradorUrb colab2;
    public  Urbanizacion urb;
    private ArrayList<Residente> residentes=new ArrayList<Residente>();
    private ArrayList<Reserva> reservas=new ArrayList<Reserva>();
    private ArrayList<Visitante> visitantes=new ArrayList<Visitante>();
    

    public static void main(String[] args) throws ParseException {
        SistemaIngreso sistema=new SistemaIngreso();
        sistema.inicializarSistema();
        Scanner sc= new Scanner(System.in);
        boolean bandera=true;
        while (bandera){
            System.out.println(
                "                 Sistema de ingreso a las urbanizaciones\n"
                        + "1. Urbanizacion\n"
                        + "2. Residentes\n"
                        + "3.Visitantes\n"
                        + "4. Colaboradores de la urbanizacion\n"
                        + "5. Permisos de entrada\n"
                        + "6. Revision de entrada\n"
                        + "7. Reportes\n"
                        + "8. Salir\n"
                
        );
        System.out.print("Seleccione opcion:");
        int op=sc.nextInt();
        
        switch (op){
            case 1:
                System.out.println("********URBANIZACION*********");
                System.out.println(sistema.urb);
                System.out.print("Desea modificar algun dato?:(S/N)");
                String opModificar= sc.next();
                opModificar=opModificar.toUpperCase();
                System.out.println(opModificar);
                
                if (opModificar.equals("S")){
                    System.out.println("         Campo a modificar:");
                    System.out.println("1.- Nombres");                           
                    System.out.println("2.- Etapa");
                    System.out.println("3.- Email administracion:");
                    System.out.println("4.- Direccion:");
                    System.out.println("5.- Constructora:");
                    System.out.println("6.- Regresar");
                    System.out.print("Ingrese opcion:");
                    int opcion=sc.nextInt();
                    switch (opcion){
                        case 1:
                            System.out.print("Nombre:");
                            String nombre=sc.nextLine();
                            sistema.urb.setNombreUrb(nombre);
                            break;
                        case 2:
                            System.out.print("Etapa:");
                            String etapa=sc.nextLine();
                            sistema.urb.setEtapaUrb(opcion);
                            break;
                        case 3:
                            System.out.print("Email administracion:");
                            String email=sc.nextLine();
                            sistema.urb.setEmailAdmin(email);
                            break;
                        case 4:
                            System.out.print("Direccion:");
                            String direccion=sc.nextLine();
                            sistema.urb.setDireccionUrb(direccion);
                            break;
                        case 5:
                            System.out.print("Constructora");
                            String constructora=sc.nextLine();
                            sistema.urb.setConstructoraUrb(constructora);
                            break;
                        case 6:
                            System.out.println("Regresando...");
                            break;
                        default:
                            System.out.print("Ingrese una opcion correcta:");
                            opcion=sc.nextInt();
                            break;
                            
                    }
                            
                }
                
                
                break;

            case 2:
                System.out.println("********Residentes*******");
                sistema.mostrarInformacionResidentes(sistema.residentes);
                
                System.out.println("  Que desea hacer?");
                System.out.println("1.- Agregar residente");
                System.out.println("2.- Modificar Residente ");
                System.out.println("3.- Eliminar Residente");
                System.out.println("4.- Continuar");
                System.out.print("Opcion:");
                int opResidente= sc.nextInt();
                int indice;
                switch (opResidente){
                    case 1:
                        System.out.println("Ingrese los datos del residente en el siguiente formato (villaResidente,cantidadPersonasQue viven con el resdiente,Cedula,Nombre,Telefonoelefono,Email))");
                        String datosResidente=sc.nextLine();
                        sistema.agregarResidente(sistema.residentes, datosResidente);
                        break;
                    case 2:
                        System.out.println("Ingrese numero de residente a modificar");
                        indice=sc.nextInt()-1;
                        sistema.modificarResidente(sistema.residentes, indice);
                        break;
                    case 3:
                        System.out.println("Ingrese numero de residente a modificar");
                        indice=sc.nextInt()-1;
                        sistema.eliminarResidente(sistema.residentes, indice);
                        break;
                    default:
                        break;
                }
                
                
                break;
            case 3:
                sistema.mostrarInformacionVisitantes(sistema.visitantes);
                System.out.println("  Que desea hacer?");
                System.out.println("1.- Agregar Visitante");
                System.out.println("2.- Modificar Visitante ");
                System.out.println("3.- Continuar");
                System.out.print("Opcion:");
                int opVisitante= sc.nextInt();
                switch (opVisitante){
                    case 1:
                        System.out.print("Ingrese los datos del visitante en el siguiente formato (cedula,nombre,telefono,email,historialSancion) :");
                        String informacion=sc.nextLine();
                        
                        System.out.println("Es repartidor (S/N)");
                        String esRep=sc.next().toUpperCase();
                        String empresa;
                        if (esRep.equals("S")){
                            System.out.print("Ingrese empresa:");
                            empresa=sc.nextLine();
                        }else{
                            empresa=null;
                        }
                        
                        break;

                    case 2:
                        System.out.println("Ingrese numero de Visitante a modificar");
                        int indiceVisita=sc.nextInt()-1;
                        System.out.println("Que campo desea Modificar?");
                        break;
                    default:
                        break;
                }
                
                
                
                
                System.out.println("");
                break;
            case 4:
                System.out.println("    COlaboradores");
                sistema.mostrarInformacionColaboradores(sistema.colaboradores);
                
                break;
            case 5:
                System.out.println("     Permisos de Entrada    ");
                System.out.println("1. Crear permiso de entrada");
                System.out.println("2. Eliminar Permiso de entrada");
                System.out.println("3. Consultar permisos por mz y villa");
                break;
            case 6:
                System.out.println("");
                break;
            case 7:
                System.out.println("");
                break;
            case 8:
                bandera=false;
                System.out.println("Gracias por ulizar  nuestros servicios...");
                break;
            default:
                System.out.print("Ingrese una opcion correcta:");
                op=sc.nextInt();
        }
                
                
        }
        
        
    }

 
    public void inicializarSistema() throws ParseException{
        DateFormat formateador= new SimpleDateFormat("dd/M/yy");
        DateFormat formateadorHora= new SimpleDateFormat("hh:mm");
    
        this.urb=new Urbanizacion("Atlantis", 1, "adminAtlantis@atlantis.com", "Via a la costa", "Constructora ATL",colab2);
        
        ColaboradorUrb colab1 = new ColaboradorUrb("0954392116", "Juan Alava", "0987556189", "jalava@atlantis.com", "Guardia", TipoEmpleado.GUARDIA, EstadoPersona.ACTIVO , formateador.parse("10/01/2022"), formateador.parse("10/01/2028"));
        colaboradores.add(colab1);
        ColaboradorUrb colab2 = new ColaboradorUrb("0913540897", "Christhian Macias", "09996573452", "cmacias@atlantis.com", "Guardia", TipoEmpleado.GUARDIA, EstadoPersona.ACTIVO, formateador.parse("10/01/2022"), formateador.parse("10/01/2028"));
        
        colaboradores.add(colab2);
        Residente residente=new Residente(EstadoPersona.ACTIVO, "12", 6, urb,"0954223214", "Benito Martinez", "098767897","benito@hotmail.com");
        residentes.add(residente);
        Visitante visitante1=new Visitante("13034323456", "Jose Flores", "0964734258", "Jflores@hotmail.com","");
        visitantes.add(visitante1);
        Reserva reserva=new Reserva(EstadoReserva.ACTIVO, formateadorHora.parse("03:00"), formateador.parse("06/12/2022"), residente,visitante1,generarCodigoReserva(reservas),formateadorHora.parse("17:00"));
        System.out.println("Hora"+reserva.getHoraIngreso().getTime());
        reservas.add(reserva);
        Visitante visitante2=new Visitante("13555553456", "Luis Macancela", "09989666676", "lmacancela@hotmail.com","");
        visitantes.add(visitante2);
        Reserva reserva2=new Reserva(EstadoReserva.INACTIVO, formateadorHora.parse("03:00"), formateador.parse("04/12/2022"), residente,visitante2,generarCodigoReserva(reservas),formateadorHora.parse("17:00"));
        reservas.add(reserva2);
        urb.setAdmin(urb.seleccionarAdmin(colaboradores));
        
        
        
        
    }
    public int generarCodigoReserva(ArrayList<Reserva> reservas){
        return reservas.size()*100+1;
        
    }
    
    public void mostrarInformacionResidentes(ArrayList<Residente> residentes){
        int i=1;
        for(Residente residente:residentes){
            System.out.print(i+"..."+residente);
            i++;
            
        }
    }
    public void agregarResidente(ArrayList<Residente> residentes,String datos){
        String[] info=datos.split(",");
        //villaResidente,cantidadPersonasQue viven con el resdiente,Cedula,Nombre,Telefonoelefono,Email
        String villaResidente=info[0];
        int cantidadPersonas= Integer.parseInt(info[1]);
        String cedula= info[2];
        String nombre=info[3];
        String telefono=info[4];
        String email=info[5];
        //String estadoResidente, String villaResidente, int cantidadPersonas, Urbanizacion urbanizacion, String cedula, String nombre, String telefono, String emai
        Residente residente=new Residente(EstadoPersona.ACTIVO, villaResidente, cantidadPersonas, urb, cedula, nombre, telefono, email);
        residentes.add(residente);
        
        
    }
    public void modificarResidente(ArrayList<Residente> residentes,int indice){
        
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
    public void eliminarResidente(ArrayList<Residente> residentes,int indice){
        Residente r=residentes.get(indice);
        r.setEstadoResidente(EstadoPersona.INACTIVO);
        residentes.set(indice, r);
        
    }
    public void mostrarInformacionVisitantes(ArrayList<Visitante> visitantes){
        int i=1;
        for (Visitante visita:visitantes){
            System.out.println(i+"..."+visita);
            i++;
        }
        
    }
    public void mostrarInformacionColaboradores(ArrayList<ColaboradorUrb> colaboradores){
        int i=1;
        for (ColaboradorUrb colaborador:colaboradores){
            System.out.println(i+"...."+colaborador);
            i++;
        }
    }
    public void agregarVisitante(ArrayList<Visitante> visitantes,String informacion,String empresa){
        String[] datos=informacion.split(informacion);
        //cedula,nombre,telefono,email,historialSancion
        Visitante nuevo=new Visitante(datos[0], datos[1], datos[2], datos[3], datos[4],empresa);
        visitantes.add(nuevo);
        
    }
    public void modificarVisitante(ArrayList<Visitante> visitantes,int indice){
        
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
