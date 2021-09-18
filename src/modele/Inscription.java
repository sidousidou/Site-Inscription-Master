package modele;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

public class Inscription {
	public static Inscription ins = new Inscription();

	private static ArrayList<Candidat> candidats = new ArrayList<Candidat>();

	public static ArrayList<Candidat> getCandidats() {
		return candidats;
	}

	public static void setCandidats(ArrayList<Candidat> candidats) {
		Inscription.candidats = candidats;
	}

	public ArrayList<Candidat> getAll() {
		return candidats;
	}

	public Candidat trouverCandidat(int mat) {
		for (Candidat c : candidats) {
			if (c.getMatricule() == mat) {
				return c;
			}
		}
		return null;
	}

	public boolean verifierNomPrenom(String nom, String prenom) {
		for (Candidat c : candidats) {
			if (c.getNom().equals(nom) && c.getPrenom().equals(prenom)) {
				return true;
			}
		}
		return false;
	}

	public boolean verifierMatricule(int mat) {
		for (Candidat c : candidats) {
			if (c.getMatricule() == mat) {
				return true;
			}
		}
		return false;
	}

	public boolean inscrire(Candidat c) {
		if (verifierNomPrenom(c.getNom(), c.getPrenom())) {
			return false;
		} else {
			candidats.add(c);
			return true;
		}
	}

	public boolean annuler(int mat) {
		if (verifierMatricule(mat)) {
			candidats.removeIf(c -> c.getMatricule() == mat);
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	public Candidat rechercher(int mat) {
		com.mysql.jdbc.Statement stmt=null;
		Connection cnx=null;
		ResultSet res;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		
		 try {
			cnx=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/Candidats","root","sidouhaha..  ");
			stmt=(com.mysql.jdbc.Statement) cnx.createStatement();
			res= stmt.executeQuery("select * from candidats where Matricule='"+mat+"'");
			res.next();
			int matr = res.getInt("Matricule");
			String nom =res.getString("nom");
			String prenom =res.getString("prenom");
			String specialite =res.getString("specialite");
			Candidat can=new Candidat();

			can.setMatricule(matr);
			can.setNom(nom);
			can.setPrenom(prenom);
			System.out.println(nom);
			return can;
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return null;
	}
	
	
	
	
}
