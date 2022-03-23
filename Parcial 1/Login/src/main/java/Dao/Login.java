/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Entidades.Estudiante;
import com.carlos.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author cb272
 */
public class Login {
    
    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();
    
    public int Login(Estudiante es){
    
        int result=0;
        try {
            CallableStatement cb = conexion.prepareCall("{call SP_S_LOGIN(?,?)}");
            cb.setString("Estuser", es.getUser());
            cb.setString("Estpass", es.getPassword());
            ResultSet resultado = cb.executeQuery();
            
            
            while(resultado.next()){
                result = resultado.getInt("idestudiante");
            }
            
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error "+ex.toString(),"Mensjae sistems",1);
        }
        return result;
    }
}
