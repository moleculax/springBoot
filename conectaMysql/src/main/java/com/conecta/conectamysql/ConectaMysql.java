/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.conecta.conectamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;



/**
 *
 * @author EMILIO
 */
public class ConectaMysql {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    	System.out.println("CONECTANDO CON MYSQL!");
        System.out.print("Intro Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Consulta por: "+nombre);
        System.out.println();
        entrada.close();
        
        
        String url = "jdbc:mysql://localhost:3306/bd_ejemplo?serverTimezone=UTC";
        String user = "admin";
        String password = "admin123";
     
        
        String query = "SELECT id"
                                + ", name"
                                + ", telefono"
                                + " FROM persona where name LIKE ?";
       
        try {
        	 Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query);
             //stmt.setString(1, nombre);
             stmt.setString(1, "%" + nombre + "%"); // porque estoy usando like en sql
 
              ResultSet rs = stmt.executeQuery();
              
              boolean encontrado = false;

              
            while (rs.next()) {
               System.out.println("ID: " + rs.getInt("id"));
               System.out.println("NAME: " + rs.getString("name"));
               System.out.println("TELEFONO: " + rs.getString("telefono"));

                // Puedes acceder a otras columnas con rs.getInt(), rs.getDate(), etc.
            }
            
            if (!encontrado) {
                System.out.println("No se encontraron resultados para: " + nombre);
            }


        } catch (Exception e) {
         
           e.printStackTrace();
        }
        
    }
}
