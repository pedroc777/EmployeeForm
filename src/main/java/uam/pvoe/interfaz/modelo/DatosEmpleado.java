/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.interfaz.modelo;

/**
 *
 * @author pedro
 */
public class DatosEmpleado {
    private String nombre;
    private String rfc;
    private String direccion;

    public DatosEmpleado(String nombre, String rfc, String direccion) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Datos del empleado: " + "\nNombre: " + nombre + "\nRFC:" +
                rfc.toUpperCase() + "\nDireccion: " + direccion;
    }
    
    
}
