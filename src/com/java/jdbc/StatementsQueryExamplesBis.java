package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StatementsQueryExamplesBis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// INTERROGAZIONE DELLA TABELLA students
		try {
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "CorsoJava_2025"
            );
            
            System.out.println("Connesso!");

            //Stampa i dati dello studente con nome = 'Marco'
           
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE name = ?;");
            
            ps.setString(1, "Marco");
            
            System.out.println("Dati dello studente con nome Marco:");
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
            }
            
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
		
		
		
		
		
	}

}
