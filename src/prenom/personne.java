package prenom;
public class personne {

	private String nom;
	private String prenom;
	
	public personne (String nom, String prenom) {
		this.prenom = prenom;
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String toString() {
		return prenom + " " + nom;
	}
}