package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbEcxeption;

public class DbConnection {		
private static final String Host = "localhost";
private static final String Password = "projects";
private static final int Port = 3306;
private static final String Schema = "projects";
private static final String User = "projects";

public static Connection getConnection() {
 String uri = String.format("jdbc:mysql://%s:%d/%s", Host, Port, Schema);
 
 try {
 return DriverManager.getConnection(uri, User, Password);
 }
 catch (SQLException e) {
	 throw new DbEcxeption(e);
 }
}
	}
