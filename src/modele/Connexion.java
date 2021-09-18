package modele;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Connexion {

	com.mysql.jdbc.Statement stmt=null;
	Connection cnx=null;
	ResultSet res;
	public Connexion() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO: handle exception
	}
	
	 try {
		cnx=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/Candidats","root","sidouhaha..  ");
		
	 } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
}
