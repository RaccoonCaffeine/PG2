/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Conexion;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;

/**
 *
 * @author RaccoonCaffeine
 */
public class Rellenado {
    
    private Conexion con;
    
    
    public Rellenado(){
        con = new Conexion();
    }
    
     public Rellenado(Conexion con) {
        this.con = con;
    }

    public Conexion getCon() {
        return con;
    }

    public void setCon(Conexion con) {
        this.con = con;
    }
    
    public void RellenarCombo(String table, String value, JComboBox cb) {
        String sql = "SELECT " + value + " FROM " + table;
        getCon().ConnectarBD();
        try {
            PreparedStatement pst = getCon().getCon().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cb.addItem(rs.getString(value));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            getCon().DesconectarBD();
        }
    }

    public void NroOrden(JTextField text) {
        String sql = "SELECT Auto_increment FROM information_schema.tables WHERE table_name='aclaracion'";
        getCon().ConnectarBD();
        try {
            PreparedStatement pst = getCon().getCon().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                text.setText(rs.getString("Auto_increment"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el número de orden: " + ex.getMessage());
        } finally {
            getCon().DesconectarBD();
        }
    }
}
