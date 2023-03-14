package histoire;

import personnages.Gaulois;
import personnages.Romains;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix;
		asterix=new Gaulois("Astérix",8);
		Romains minus;
		minus=new Romains("Minus",6);
		
		asterix.parler("Bonjour a tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		

	}

}
