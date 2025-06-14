/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;

/**
 *
 * @author Dilki Raveesha
 */
public class DBConnection {
     public static Connection CreateConnection() throws Exception{
    
       String url = "jdbc:mysql://gator4180.hostgator.com:3306/kmalith2_trafficreporter";
            String username = "kmalith2_dilki";
            String password = "mnY325[mC((I";
            
             Connection con = DriverManager.getConnection(url, username, password);
        return con;
    
    }

    
    
}
