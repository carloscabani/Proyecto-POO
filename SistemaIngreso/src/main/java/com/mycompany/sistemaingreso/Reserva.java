/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemaingreso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author gstevs
 */
// clase que contiene la informacion de cada reserva
public class Reserva {
    private EstadoReserva estado;
    private Date fechaCreacion;
    private Date duracion;
    private Date fechaIngreso;
    private Date horaIngreso;
    private Residente residente;
    private int codigo;
    private Visitante visitante;
    
    
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getDuracion() {
        return duracion;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Date horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Residente getResidente() {
        return residente;
    }

    public void setResidente(Residente residente) {
        this.residente = residente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }
    

    public Reserva(EstadoReserva estado, Date duracion, Date fechaIngreso, Residente residente,Visitante visitante,int codigo,Date horaIngreso) {
        this.estado = estado;
        this.duracion = duracion;
        this.fechaIngreso = fechaIngreso;
        this.residente = residente;
        this.fechaCreacion=new Date();
        this.horaIngreso=horaIngreso;
        this.visitante=visitante;
        this.residente=residente;
        this.codigo=codigo;
        
    }
  

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }
    public static int generarCodigoReserva(ArrayList<Reserva> reservas){
        return reservas.size()*1000+1;
        
    }
    
    public static ArrayList<Reserva> reservasResidente(ArrayList<Reserva> reservas,String cedula){
        
        ArrayList<Reserva> reservaCliente=new ArrayList<Reserva>();
        for (Reserva r:reservas){
            if (r.getResidente().getCedula().equals(cedula)){
                reservaCliente.add(r);
            }
        }
        return reservaCliente;
    }
    public static void mostrarReservas(ArrayList<Reserva> reservas){
        
        int i=1;
        for (Reserva r:reservas){
            System.out.println(i+"..."+r);
        }
    }
    public static void eliminarReserva(ArrayList<Reserva> reservas,Reserva r){
        for(Reserva res:reservas){
            if (res.equals(r)){
                res.setEstado(EstadoReserva.INACTIVO);
            }
        }
    }
    public static void consultarReservaMzVilla(ArrayList<Reserva> reservas,String mz, String villa){
        ArrayList<Reserva> reservaCliente=new ArrayList<Reserva>();
        for(Reserva res:reservas){
            if(res.getResidente().getMz().equals(mz) && res.getResidente().getVillaResidente().equals(villa)){
                System.out.println(reservaCliente.add(res));
            }
        }
        
   
    }
    public static void verificarIngreso(ArrayList<Reserva> reservas,int codigo,String cedula){
        for (Reserva r:reservas){
            if (r.getCodigo()==codigo && r.getVisitante().getCedula().equals(cedula)){
                System.out.println(r.getEstado());
                if (r.getEstado().equals(EstadoReserva.ACTIVO)){
                    System.out.println("Puede ingresar");
                    r.setEstado(EstadoReserva.USADO);
                }
            }
        }
        
    }
    public static void reporteReservas(ArrayList reservas,String cedula){
        ArrayList<Reserva> reservasR=reservasResidente(reservas, cedula);
        for (Reserva r:reservasR){
            System.out.println("Estado:"+r.getEstado()+"   Visitante:"+r.getVisitante().getNombre()+"  ");
        }
        
        
    }

    //static class SortByDate implements Comparator<Date> {
    //@Override
//        public int compare(Date a, Date b) {
//            return a.compareTo(b);
//        }
//    }
}
