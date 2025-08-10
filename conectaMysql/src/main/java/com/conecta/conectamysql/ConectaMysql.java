/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.conecta.conectamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author EMILIO
 */
public class ConectaMysql {


    public static void main(String[] args) {
        System.out.println("CONECTANDO CON MYSQL!");
        
        String url = "jdbc:mysql://localhost:3306/bd_ejemplo?serverTimezone=UTC";
        String user = "admin";
        String password = "admin123";

        String query = "SELECT id"
                                + ", name"
                                + ", telefono"
                                + " FROM persona";

        try (Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
               System.out.println("ID: " + rs.getString("id"));
               System.out.println("NAME: " + rs.getString("name"));
               System.out.println("TELEFONO: " + rs.getString("telefono"));

                // Puedes acceder a otras columnas con rs.getInt(), rs.getDate(), etc.
            }

        } catch (Exception e) {
         
           e.printStackTrace();
        }
        
    }
}
