/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AgregarAclara;
import Modelo.Conexion;
import java.sql.*;

/**
 *
 * @author RaccoonCaffeine
 */
public class AgregarDao {
    
    private Conexion con;
    
    public AgregarDao() {
        con = new Conexion();
    }

    public AgregarDao(Conexion con) {
        this.con = con;
    }

    public Conexion getCon() {
        return con;
    }

    public void setCon(Conexion con) {
        this.con = con;
    }
    
    public String insertarDatos(AgregarAclara objAgre){
        String mensaje = "";
        getCon().ConnectarBD();
        try{
            PreparedStatement pst = getCon().getCon().prepareStatement("INSERT INTO ACLARACION (RUT_PERSONA,NOMBRE_PERSONA,BANCO,ID_PRODUCTO,ID_MOTIVO,ID_TIPO_DEUDA,RAZON) VALUES (?,?,?,?,?,?,?)");
            pst.setString(1, objAgre.getRut());
            pst.setString(2, objAgre.getNombre());
            pst.setString(3, objAgre.getBanco());
            pst.setInt(4, objAgre.getProducto());
            pst.setInt(5, objAgre.getMotivo());
            pst.setInt(6, objAgre.getTipoDeuda());
            pst.setString(7, objAgre.getRazon());
            int resultado = pst.executeUpdate(); // ejecución de la sentencia
            mensaje = "Se agregaron " + resultado + " registros";
        }catch(SQLException ex){
            mensaje = "Error al insertar los datos el tabla de reparaciones" + ex.getMessage();
        }finally{
            getCon().DesconectarBD();
        }
        return mensaje;
    }
   
}
