
package com.mycompany.sistemaingreso;

import java.util.ArrayList;
import java.util.Random;


public class ColaboradorUrb {
    

    public String cedulaEmpleado;
    public String nombreEmpleado;
    public String telefonoEmpleado;
    public String emailEmpleado;
    public String puestoTrabajo;
    public String tipoEmpleado;
    public String estadoEmpleado;
    public String fechaInicioActiv;
    public String fechaFinActiv;
    
   //preguntar sobre
//tipo de empleado (guardía, administrador, jardinero), estado (activo/inactivo),

public void mostrarInfoColaborador(){
        System.out.println("Nombre: "+nombreEmpleado+"\nCedula: "+cedulaEmpleado+
                "\nTelefono: "+telefonoEmpleado+"\nEmail: "+emailEmpleado+
                "\nCargo: "+puestoTrabajo+"\nTipo de empleado: "+tipoEmpleado+
                "\n Estado del empleado: "+estadoEmpleado+
                "\nFecha de inicio de actividades: "+fechaInicioActiv+
                "\nFecha de fin de actividades: "+fechaFinActiv);
}

Random rd =new Random();


public String seleccionarEmpleado(ArrayList<String> empleado){
    int n= rd.nextInt(empleado.size());
    String empleadoSeleccionado= empleado.get(n);
    
    
    return empleadoSeleccionado;
    

}


}
