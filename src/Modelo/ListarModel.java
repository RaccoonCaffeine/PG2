/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author RaccoonCaffeine
 */
public class ListarModel {
    private int nro;
    private String nombre;
    private String institucion;
    private String producto;

    public ListarModel() {
    }

    public ListarModel(int nro, String nombre, String institucion, String producto) {
        this.nro = nro;
        this.nombre = nombre;
        this.institucion = institucion;
        this.producto = producto;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "ListarModel{" + "nro=" + nro + ", nombre=" + nombre + ", institucion=" + institucion + ", producto=" + producto + '}';
    }
    
    
}
