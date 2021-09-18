package modele;

public class Specialite {
	private int code;
	private String intitule;

	public Specialite(int code, String intitule) {
		super();
		this.code = code;
		this.intitule = intitule;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
}
