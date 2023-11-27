/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author RaccoonCaffeine
 */
public class AgregarAclara {
    private String rut,nombre,banco,razon;
    private int producto,motivo,tipoDeuda;

    public AgregarAclara() {
    }

    public AgregarAclara(String rut, String nombre, String banco, String razon, int producto, int motivo, int tipoDeuda) {
        this.rut = rut;
        this.nombre = nombre;
        this.banco = banco;
        this.razon = razon;
        this.producto = producto;
        this.motivo = motivo;
        this.tipoDeuda = tipoDeuda;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getMotivo() {
        return motivo;
    }

    public void setMotivo(int motivo) {
        this.motivo = motivo;
    }

    public int getTipoDeuda() {
        return tipoDeuda;
    }

    public void setTipoDeuda(int tipoDeuda) {
        this.tipoDeuda = tipoDeuda;
    }

    @Override
    public String toString() {
        return "Agregar{" + "rut=" + rut + ", nombre=" + nombre + ", banco=" + banco + ", razon=" + razon + ", producto=" + producto + ", motivo=" + motivo + ", tipoDeuda=" + tipoDeuda + '}';
    }
    
    

}