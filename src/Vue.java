import java.awt.BorderLayout;
import java.awt.Frame;

public class Vue extends Frame {
	
	public static void main(String[] args) {
		new Vue();
	}
	
	Modele modl;
	
	public Vue () {
		Modele modl = new Modele();
		Controleur ctrl = new Controleur();
		
		this.setLayout(new BorderLayout());
		
		Plateau_de_jeu panneauCentre = new Plateau_de_jeu(modl);
		this.add(panneauCentre, BorderLayout.CENTER);
		
		this.setTitle("BIENVENUE SUR SCRABBLORONA");
		this.pack();
		this.setVisible(true);
	}

}
