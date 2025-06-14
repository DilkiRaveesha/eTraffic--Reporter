/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Kasun
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class hostgatorTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // or "com.mysql.jdbc.Driver" for older versions

            String url = "jdbc:mysql://gator4180.hostgator.com:3306/kmalith2_trafficreporter";
            String username = "kmalith2_dilki";
            String password = "mnY325[mC((I";

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to HostGator DB!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
