/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistemaingreso;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
                Residente.mostrarInformacionResidentes(sistema.residentes);
                
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
                        System.out.println("Ingrese los datos del residente en el siguiente formato (villaResidente,mz ,cantidadPersonasQue viven con el resdiente,Cedula,Nombre,Telefonoelefono,Email))");
                        String datosResidente=sc.nextLine();
                        Residente.agregarResidente(sistema.residentes, datosResidente,sistema.urb);
                        break;
                    case 2:
                        System.out.println("Ingrese numero de residente a modificar");
                        indice=sc.nextInt()-1;
                        Residente.modificarResidente(sistema.residentes, indice);
                        break;
                    case 3:
                        System.out.println("Ingrese numero de residente a modificar");
                        indice=sc.nextInt()-1;
                        Residente.eliminarResidente(sistema.residentes, indice);
                        break;
                    default:
                        break;
                }
                
                
                break;
            case 3:
                Visitante.mostrarInformacionVisitantes(sistema.visitantes);
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
                int opPermiso=sc.nextInt();
                if (opPermiso==1){
                    Residente.mostrarInformacionResidentes(sistema.residentes);
                    System.out.print("Seleccione el residente:");
                    int ind=sc.nextInt()-1;
                    Residente r=sistema.residentes.get(ind);
                    System.out.print("Selelecione el visitante:");
                    ind=sc.nextInt();
                    Visitante v=sistema.visitantes.get(ind);
                    System.out.print("Fecha de ingreso:(dd/mm/aaaa):");
                    DateFormat formateador= new SimpleDateFormat("dd/M/yy");
                    DateFormat formateadorHora= new SimpleDateFormat("HH:mm");
                    
                    Date f=formateador.parse(sc.nextLine());
                    
                    System.out.print("Hora:(HH:mm)");
                    Date horaIngreso=formateador.parse(sc.nextLine());
                    System.out.println("Duracion:(HH:mm)");
                    Date duracion=formateador.parse(sc.nextLine());
                    int codigo=Reserva.generarCodigoReserva(sistema.reservas);
                    //EstadoReserva estado, Date duracion, Date fechaIngreso, Residente residente,Visitante visitante,int codigo,Date horaIngreso
                    Reserva nuevaReserva=new Reserva(EstadoReserva.ACTIVO, duracion, f, r, v, codigo, horaIngreso);
                 
                }else if (opPermiso==2){
                    System.out.print("Ingrese cedula del residente:");
                    String cedula=sc.nextLine();
                    
                    ArrayList<Reserva> reservaCliente=Reserva.reservasResidente(sistema.reservas, cedula);
                    Reserva.mostrarReservas(reservaCliente);
                    System.out.print("Cual desea eliminar?:");
                    indice=sc.nextInt()-1;
                    Reserva r=reservaCliente.get(indice);
                    Reserva.eliminarReserva(reservaCliente, r);
                }else if(opPermiso==3){
                    System.out.print("Ingrese mz:");
                    String mz=sc.nextLine();
                    System.out.print("Ingrese villa:");
                    String villa=sc.nextLine();
                    Reserva.consultarReservaMzVilla(sistema.reservas, mz, villa);
                }
                break;
            case 6:
                System.out.println("");
                System.out.println("Ingrese codigo:");
                int codigo=sc.nextInt();
                System.out.println("Ingrese cedula:");
                String cedula=sc.nextLine();
                
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
        DateFormat formateadorHora= new SimpleDateFormat("HH:mm");
    
        this.urb=new Urbanizacion("Atlantis", 1, "adminAtlantis@atlantis.com", "Via a la costa", "Constructora ATL",colab2);
        
        ColaboradorUrb colab1 = new ColaboradorUrb("0954392116", "Juan Alava", "0987556189", "jalava@atlantis.com", "Guardia", TipoEmpleado.GUARDIA, EstadoPersona.ACTIVO , formateador.parse("10/01/2022"), formateador.parse("10/01/2028"));
        colaboradores.add(colab1);
        ColaboradorUrb colab2 = new ColaboradorUrb("0913540897", "Christhian Macias", "09996573452", "cmacias@atlantis.com", "Guardia", TipoEmpleado.GUARDIA, EstadoPersona.ACTIVO, formateador.parse("10/01/2022"), formateador.parse("10/01/2028"));
        
        colaboradores.add(colab2);
        Residente residente=new Residente(EstadoPersona.ACTIVO, "12", "237",6, urb,"0954223214", "Benito Martinez", "098767897","benito@hotmail.com");
        residentes.add(residente);
        Visitante visitante1=new Visitante("13034323456", "Jose Flores", "0964734258", "Jflores@hotmail.com","");
        visitantes.add(visitante1);
        Reserva reserva=new Reserva(EstadoReserva.ACTIVO, formateadorHora.parse("03:00"), formateador.parse("06/12/2022"), residente,visitante1,Reserva.generarCodigoReserva(reservas),formateadorHora.parse("17:00"));
        System.out.println("Hora"+reserva.getHoraIngreso().getTime());
        reservas.add(reserva);
        Visitante visitante2=new Visitante("13555553456", "Luis Macancela", "09989666676", "lmacancela@hotmail.com","");
        visitantes.add(visitante2);
        Reserva reserva2=new Reserva(EstadoReserva.INACTIVO, formateadorHora.parse("03:00"), formateador.parse("04/12/2022"), residente,visitante2,Reserva.generarCodigoReserva(reservas),formateadorHora.parse("17:00"));
        reservas.add(reserva2);
        urb.setAdmin(urb.seleccionarAdmin(colaboradores));
        
        
        
        
    }
    
    
    
    
    
    
    
    public void mostrarInformacionColaboradores(ArrayList<ColaboradorUrb> colaboradores){
        int i=1;
        for (ColaboradorUrb colaborador:colaboradores){
            System.out.println(i+"...."+colaborador);
            i++;
        }
    }
    
    
    
}
