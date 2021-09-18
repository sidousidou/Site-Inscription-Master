package modele;

import java.time.LocalDate;
import java.util.ArrayList;

public class Candidat {
	private static int mat = 0;
	private int matricule, progression, rattrapage, redoublements;
	private String nom, prenom;
	private LocalDate dateNaissance;
	private ArrayList<Double> moyennes = new ArrayList<Double>();

	public Candidat() {
		super();
	}
	
	public Candidat(String nom, String prenom, LocalDate dateNaissance, ArrayList<Double> moyennes, int progression,
			int rattrapage, int redoublements) {
		super();
		this.matricule = mat++;
		this.progression = progression;
		this.rattrapage = rattrapage;
		this.redoublements = redoublements;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.moyennes = moyennes;
	}

	@Override
	public String toString() {
		return "Candidat => { matricule= " + matricule + " , progression= " + progression + " , rattrapage= " + rattrapage
				+ " , redoublements= " + redoublements + " , nom= " + nom + " , prenom= " + prenom + " , dateNaissance= "
				+ dateNaissance + " , moyennes= " + moyennes + " }";
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public int getProgression() {
		return progression;
	}

	public void setProgression(int progression) {
		this.progression = progression;
	}

	public int getRattrapage() {
		return rattrapage;
	}

	public void setRattrapage(int rattrapage) {
		this.rattrapage = rattrapage;
	}

	public int getRedoublements() {
		return redoublements;
	}

	public void setRedoublements(int redoublements) {
		this.redoublements = redoublements;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public ArrayList<Double> getMoyennes() {
		return moyennes;
	}

	public void setMoyennes(ArrayList<Double> moyennes) {
		this.moyennes = moyennes;
	}

}
