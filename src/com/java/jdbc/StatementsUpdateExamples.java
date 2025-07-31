package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementsUpdateExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// MODIFICA DI UN RECORD DELLA TABELLA students
		try {
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "CorsoJava_2025"
            );
            
            System.out.println("Connesso!");

            // Modifica l’età dello studente con id=1 a 25.
           
            Statement stmt = conn.createStatement();
            
            stmt.executeUpdate("UPDATE students SET age = 25 WHERE id = 1;");
            
            System.out.println("Studente con id = 1 modificato nella tabella students");
            
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
