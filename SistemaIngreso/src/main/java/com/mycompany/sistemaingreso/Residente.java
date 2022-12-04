
package com.mycompany.sistemaingreso;

import java.util.ArrayList;


public class Residente {
    public String cedulaResidente;
    public String nombreResidente;
    public String telefonoResidente;
    public String emailResidente;
    public String estadoResidente;//activo o inactivo
    public String villaResidente;
    public int cantidadPersonas;
    public String urbanizacion;
    
    
    
public void mostrarInfoResidente(){
        System.out.println("Nombre: "+nombreResidente+"\nCedula: "+cedulaResidente+
                "\nTelefono: "+telefonoResidente+"\nEmail: "+emailResidente+
                "\nEstado: "+estadoResidente+"\nVilla: "+villaResidente+
                "\nCantidad de personas: "+cantidadPersonas+"\nUrbanizacion: "+urbanizacion);
}
/*mz no es definido
Se podrán agregar residentes, editar y eliminar. La acción de eliminar lo que hará es cambiar
el estado a Inactivo*/

public void agregarResidentes(ArrayList<String> residentes, String residente){

    residentes.add(residente);

}

public void setEditarResidentes(String residente){
    this.nombreResidente=residente;
}

public void eliminarResidente(String estadoResidente){

    if (estadoResidente.equals("Activo")){
    
        estadoResidente="Inactivo";
    }
/*además pondrá en estado inactivo algún permiso que haya sido creado
por ese residente.*/



}
}
