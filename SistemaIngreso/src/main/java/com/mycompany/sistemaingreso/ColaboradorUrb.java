
package com.mycompany.sistemaingreso;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;


public class ColaboradorUrb {
    

    public String cedulaEmpleado;
    public String nombreEmpleado;
    public String telefonoEmpleado;
    public String emailEmpleado;
    public String puestoTrabajo;
    public TipoEmpleado tipoEmpleado;
    public EstadoPersona estadoEmpleado;

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public EstadoPersona getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(EstadoPersona estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public Date getFechaInicioActiv() {
        return fechaInicioActiv;
    }

    public void setFechaInicioActiv(Date fechaInicioActiv) {
        this.fechaInicioActiv = fechaInicioActiv;
    }

    public Date getFechaFinActiv() {
        return fechaFinActiv;
    }

    public void setFechaFinActiv(Date fechaFinActiv) {
        this.fechaFinActiv = fechaFinActiv;
    }
    public Date fechaInicioActiv;
    public Date fechaFinActiv;

    public ColaboradorUrb(String cedulaEmpleado, String nombreEmpleado, String telefonoEmpleado, String emailEmpleado, String puestoTrabajo, TipoEmpleado tipoEmpleado, EstadoPersona estadoEmpleado, Date fechaInicioActiv, Date fechaFinActiv) {
        this.cedulaEmpleado = cedulaEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.puestoTrabajo = puestoTrabajo;
        this.tipoEmpleado = tipoEmpleado;
        this.estadoEmpleado = estadoEmpleado;
        this.fechaInicioActiv = fechaInicioActiv;
        this.fechaFinActiv = fechaFinActiv;
    }
    
   //preguntar sobre
//tipo de empleado (guardía, administrador, jardinero), estado (activo/inactivo),

public void mostrarInfoColaborador(){
        System.out.println("Nombre: "+nombreEmpleado+"\nCedula: "+cedulaEmpleado+
                "\nTelefono: "+telefonoEmpleado+"\nEmail: "+emailEmpleado+
                "\nCargo: "+puestoTrabajo+"\nTipo de empleado: "+tipoEmpleado+
                "\n Estado del empleado: "+estadoEmpleado+
                "\nFecha de inicio de actividades: "+fechaInicioActiv+
                "\nFecha de fin de actividades: "+fechaFinActiv+"\n\n\n");
}







}
