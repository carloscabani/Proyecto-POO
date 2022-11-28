
package com.mycompany.sistemaingreso;


public class ColaboradorUrb {
    

    public String cedulaEmpleado;
    public String nombreEmpleado;
    public String telefonoEmpleado;
    public String emailEmpleado;
    public String puestoTrabajo;
    public String fechaInicioActiv;
    public String fechaFinActiv;
    
   //preguntar sobre
//tipo de empleado (guardía, administrador, jardinero), estado (activo/inactivo),

public void mostrarInfoColaborador(){
        System.out.println("Nombre: "+nombreEmpleado+"\nCedula: "+cedulaEmpleado+
                "\nTelefono: "+telefonoEmpleado+"\nEmail: "+emailEmpleado+
                "\nCargo: "+puestoTrabajo+"\nFecha de inicio de actividades: "+fechaInicioActiv+
                "\nFecha de fin de actividades: "+fechaFinActiv);
}



}
