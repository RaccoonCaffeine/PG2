/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListarModel;
import Modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author RaccoonCaffeine
 */
public class ListarDao {
    
    private Conexion con;
    
    public ListarDao() {
        con = new Conexion();
    }
    
    public ListarDao(Conexion con) {
        this.con = con;
    }
    
    public Conexion getCon() {
        return con;
    }
    
    public void setCon(Conexion con) {
        this.con = con;
    }
    
    public ArrayList<ListarModel> obtenerTodasReparaciones() throws SQLException {
        
        ArrayList<ListarModel> listaRepa = new ArrayList();
        getCon().ConnectarBD();
        PreparedStatement pst = getCon().getCon().prepareStatement("SELECT AC.NRO_ACLARACION,AC.NOMBRE_PERSONA,AC.BANCO,PR.NOMBRE_PRODUCTO FROM ACLARACION AS AC JOIN PRODUCTO AS PR ON AC.ID_PRODUCTO = PR.ID_PRODUCTO;");
        ResultSet rs = pst.executeQuery();  // ejecuta sentencia
        while (rs.next()) {
            ListarModel obRep = new ListarModel();
            obRep.setNro(rs.getInt(1));
            obRep.setNombre(rs.getString(2));
            obRep.setInstitucion(rs.getString(3));
            obRep.setProducto(rs.getString(4));
            
            listaRepa.add(obRep);
        }
        
        return listaRepa;
    }
    
    public ArrayList<ListarModel> obtenerReparacion(String rut) throws SQLException {
        
        ArrayList<ListarModel> listaRepa = new ArrayList();
        getCon().ConnectarBD();
        PreparedStatement pst = getCon().getCon().prepareStatement("SELECT AC.NRO_ACLARACION,AC.NOMBRE_PERSONA,AC.BANCO,PR.NOMBRE_PRODUCTO FROM ACLARACION AS AC JOIN PRODUCTO AS PR ON AC.ID_PRODUCTO = PR.ID_PRODUCTO WHERE RUT_PERSONA = ?");
        ResultSet rs = pst.executeQuery();  // ejecuta sentencia
        pst.setString(1, rut);
        while (rs.next()) {
            ListarModel obRep = new ListarModel();
            obRep.setNro(rs.getInt(1));
            obRep.setNombre(rs.getString(2));
            obRep.setInstitucion(rs.getString(3));
            obRep.setProducto(rs.getString(4));
            
            listaRepa.add(obRep);
        }
        
        return listaRepa;
    }
}
