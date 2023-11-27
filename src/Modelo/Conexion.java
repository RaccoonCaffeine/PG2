/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author RaccoonCaffeine
 */
public class Conexion {
    private Connection con;

    public Conexion() {
    }

    public Conexion(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void ConnectarBD(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/estatal";
            con = DriverManager.getConnection(url,"root","");
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void DesconectarBD(){
        try{
            getCon().close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }
}
