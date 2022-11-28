
package com.mycompany.sistemaingreso;


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
//Se podrán agregar residentes, editar y eliminar. La acción de eliminar lo que hará es cambiar
//el estado a Inactivo y además pondrá en estado inactivo algún permiso que haya sido creado
por ese residente.*/



}
