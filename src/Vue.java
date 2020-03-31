import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Vue extends Frame implements WindowListener{
	
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
		
		this.addWindowListener(this);
		this.setTitle("BIENVENUE SUR SCRABBLORONA");
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
