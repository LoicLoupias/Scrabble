import java.awt.BorderLayout;
import java.awt.Frame;

public class Vue extends Frame {
	
	public static void main(String[] args) {
		new Vue();
	}
	
	public Vue () {
		Modele modl = new Modele();
		Controleur ctrl = new Controleur();
		
		this.setLayout(new BorderLayout());
		
		
	}

}
