package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementsCreateExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	CREAZIONE TABELLA Students
		try {
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "CorsoJava_2025"
            );
            
            System.out.println("Connesso!");

            Statement stmt = conn.createStatement();
            
            stmt.execute("CREATE TABLE students ("
            		+ "id SERIAL PRIMARY KEY, "
            		+ "name VARCHAR(50), "
            		+ "age INT"
            		+ ");");
            
            System.out.println("Tabella creata");
            
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
