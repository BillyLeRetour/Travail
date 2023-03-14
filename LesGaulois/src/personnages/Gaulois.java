package personnages;


public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion;
	
	public Gaulois(String nom, int force) {
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
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romains romains) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romains.getNom());
		romains.recevoirCoup(force / 3);
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix;
		Romains minus;
		minus= new Romains("Minus",6);
		asterix=new Gaulois ("Astérix",8);
		System.out.println(asterix);
		asterix.frapper(minus);
		asterix.parler("Bonjour");

	}
}