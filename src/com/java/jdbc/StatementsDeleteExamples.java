package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementsDeleteExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ELIMINAZIONE DI UN RECORD DELLA TABELLA students
		try {
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "CorsoJava_2025"
            );
            
            System.out.println("Connesso!");

            // Elimina lo studente con id = 7.
           
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("DELETE FROM students WHERE id = 7;");

            System.out.println("Studente con id = 7 eliminato dalla tabella students");

            conn.close(); 
        
		} catch (Exception e) {
            e.printStackTrace();
        }

	}

}
