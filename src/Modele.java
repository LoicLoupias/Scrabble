import java.util.Observable;

public class Modele extends Observable{

	enum Etat {
		EN_COURS, GAGNE, PERDU
	};

	public Etat etat;

	public Modele() {
		this.etat = Etat.EN_COURS;
	}
}
