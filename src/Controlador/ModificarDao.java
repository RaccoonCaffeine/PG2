/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AgregarAclara;
import Modelo.Conexion;
import Modelo.ListarModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author RaccoonCaffeine
 */
public class ModificarDao {

    private Conexion con;

    public ModificarDao() {
        con = new Conexion();
    }

    public ModificarDao(Conexion con) {
        this.con = con;
    }

    public Conexion getCon() {
        return con;
    }

    public void setCon(Conexion con) {
        this.con = con;

    }

    public ArrayList<AgregarAclara> rellenadoCampos(int nro) throws SQLException {
        ArrayList<AgregarAclara> list = new ArrayList();
        getCon().ConnectarBD();
        PreparedStatement pst = getCon().getCon().prepareStatement("SELECT * FROM ACLARACION WHERE NRO_ACLARACION =  ?");
        pst.setInt(1, nro);

        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            AgregarAclara objRep = new AgregarAclara();
            objRep.setNro(rs.getInt(1));
            objRep.setRut(rs.getString(2));
            objRep.setNombre(rs.getString(3));
            objRep.setBanco(rs.getString(4));
            objRep.setProducto(rs.getInt(5));
            objRep.setMotivo(rs.getInt(6));
            objRep.setTipoDeuda(rs.getInt(7));
            objRep.setRazon(rs.getString(8));
            list.add(objRep);
        }

        return list;
    }

    public String modificarDatos(AgregarAclara objAgre) {
        String mensaje = "";
        getCon().ConnectarBD();
        try {
            PreparedStatement pst = getCon().getCon().prepareStatement("UPDATE ACLARACION SET RUT_PERSONA = ?, NOMBRE_PERSONA = ?,BANCO = ?,ID_PRODUCTO = ?,ID_MOTIVO = ?, ID_TIPO_DEUDA = ?, RAZON = ? WHERE NRO_ACLARACION = ?");
            pst.setString(1, objAgre.getRut());
            pst.setString(2, objAgre.getNombre());
            pst.setString(3, objAgre.getBanco());
            pst.setInt(4, objAgre.getProducto());
            pst.setInt(5, objAgre.getMotivo());
            pst.setInt(6, objAgre.getTipoDeuda());
            pst.setString(7, objAgre.getRazon());
            pst.setInt(8, objAgre.getNro());
            int resultado = pst.executeUpdate(); // ejecución de la sentencia
            mensaje = "Se agregaron " + resultado + " registros";
        } catch (SQLException ex) {
            mensaje = "Error al insertar los datos el tabla de reparaciones" + ex.getMessage();
        } finally {
            getCon().DesconectarBD();
        }
        return mensaje;
    }

}
