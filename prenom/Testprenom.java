package prenom;
public class Testprenom {
	public static void main(String[] args) {
		personne P1 = new personne("Agostinelli", "Laurence");
		
		System.out.println(P1);
		System.out.println("Prénom : " + P1.getPrenom());
		System.out.println("Nom : " + P1.getNom());
	}
}