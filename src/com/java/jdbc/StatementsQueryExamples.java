package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementsQueryExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// INTERROGAZIONE TABELLA students
		try {
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "CorsoJava_2025"
            );
            
            System.out.println("Connesso!");

            //Stampa tutti gli studenti presenti
           
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
           
            System.out.println("Stampo risultati della query");
           
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
            }
           
            conn.close();
       
		} catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}