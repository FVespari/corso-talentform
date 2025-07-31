package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EsempiInserimentiStatements___DaNonUsare {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "CorsoJava_2025"
            );
		
        System.out.println("Connesso!");
		
		try { 
			
			Statement stmt = conn.createStatement();
            
            stmt.executeUpdate("INSERT INTO students (name, age) VALUES ('Jacopo', 22),('Fiona', 23);");
            
            System.out.println("Studenti inseriti");
            
            //conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
		
		
		
		
		
		

	}

}
