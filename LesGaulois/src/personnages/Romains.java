package personnages;

public class Romains {
	private String nom;
	private int force;
	
	public Romains(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	 }
	public static void main(String[] args) {
		Romains minus;
		minus=new Romains("Minus",6);
		minus.parler("Bonjour");
		minus.recevoirCoup(4);
		minus.recevoirCoup(2);
	}
}
