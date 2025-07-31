package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementsInsertExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// POPOLAMENTO TABELLA Students
		try {
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "CorsoJava_2025"
            );
            
            System.out.println("Connesso!");

            Statement stmt = conn.createStatement();
            
            stmt.executeUpdate("INSERT INTO students (name, age) VALUES ('Filiberto', 21);");
            
            System.out.println("Studente inserito in students");
            
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }		

	}

}
