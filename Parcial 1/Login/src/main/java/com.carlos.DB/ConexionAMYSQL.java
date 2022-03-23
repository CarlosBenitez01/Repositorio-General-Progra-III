/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author cb272
 */
public class ConexionAMYSQL {
    private static Connection ConnectionBD= null;
    public Connection getConecction (){
        try {
            String url = "jdbc:mysql://localhost:3306/clases";
            String user = "root";
            String password = "root";
            
            ConnectionBD = DriverManager.getConnection(url,user,password);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error "+e.toString());
        }
        
    return ConnectionBD;
    }
}
