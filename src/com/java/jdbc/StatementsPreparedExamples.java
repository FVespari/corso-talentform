package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StatementsPreparedExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// POPOLAMENTO TABELLA students
		try {
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "CorsoJava_2025"
            );
            
            System.out.println("Connesso!");

            //Stampa tutti gli studenti presenti
           
            PreparedStatement ps = conn.prepareStatement("INSERT INTO students VALUES (?, ?, ?)");
            
            ps.setInt(1, 7);
            ps.setString(2, "Franco");
            ps.setInt(3, 32);
            
            ps.executeUpdate();
           
            System.out.println("Studente aggiunto");
           
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
	}

}
