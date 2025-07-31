package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementsQueryExamplesTris {

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

            // Stampa il numero totale degli studenti
           
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS CONTEGGIO_STUDENTI FROM students;");
            
            System.out.println("Numero totale degli studenti:");
           
            while(rs.next()) {
                System.out.println(rs.getInt("CONTEGGIO_STUDENTI"));
            }
            
            conn.close(); 
        
		} catch (Exception e) {
            e.printStackTrace();
        }
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// INTERROGAZIONE DELLA TABELLA students
		try {
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "CorsoJava_2025"
            );
            
            System.out.println("Connesso!");

            // Stampa tutti gli studenti con età maggiore di 20.
           
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE age > 20 ORDER BY id;");
            
            System.out.println("Elenco studenti con età maggiore di 20:");
           
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
            }
            
            conn.close(); 
        
		} catch (Exception e) {
            e.printStackTrace();
        }
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// INTERROGAZIONE DELLA TABELLA students
		try {
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "CorsoJava_2025"
            );
            
            System.out.println("Connesso!");

            // Stampa tutti gli studenti con età maggiore di 20.
           
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM students ORDER BY name;");
            
            System.out.println("Elenco studenti ordinati per nome:");
           
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
            }
            
            conn.close(); 
        
		} catch (Exception e) {
            e.printStackTrace();
        }
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// INSERIMENTO NELLA TABELLA students E GESTIONE DELL'ECCEZIONE
		try {
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "CorsoJava_2025"
            );
            
            System.out.println("Connesso!");

            // Inserisci un record e gestisci l’eccezione in caso di errore.
           
            Statement stmt = conn.createStatement();
            
            stmt.executeUpdate("INSERT INTO students (id, name, age) VALUES (1, 'Filiberto', 21);");
            
            System.out.println("Studente inserito in students");
            
            conn.close();
            
            conn.close(); 
        
		} catch (SQLException sqlE) {
		    System.out.println("Errore SQL: " + sqlE.getMessage());
        }
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// VERIFICA SE UNO STUDENTE ESISTE O MENO
		try {
            Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "CorsoJava_2025"
            );
            
            System.out.println("Connesso!");

            //Controlla se uno studente con nome = 'Luca' esiste.
           
            PreparedStatement ps = conn.prepareStatement("SELECT name FROM students WHERE name = ?;");
            
            ps.setString(1, "Gianfiliberto");
            
            System.out.println("Verifica se c'è uno studente con nome Gianfiliberto");
            
            ResultSet rs = ps.executeQuery();
                        
            if (rs.next() && rs.getInt(1) > 0) {
                System.out.println("Studente esistente");
            } else {
                System.out.println("Studente non trovato");
            }
                        
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }	
		
		
		
	}

}
