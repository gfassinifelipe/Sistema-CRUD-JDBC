package com.giovanni.crudjdbcjava; 

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class Conexao { 
	
private static final String URL = 
"jdbc:mysql://localhost:3306/exemplo_crud"; 
private static final String USER = "root"; // Substitua pelo seu usuário 
private static final String PASSWORD = ""; // Substitua pela sua senha
public static Connection conectar() throws SQLException { 
	
return DriverManager.getConnection(URL, USER, PASSWORD); 

} 

}

