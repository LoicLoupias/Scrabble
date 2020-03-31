import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings({ "deprecation", "serial" })
public class Plateau_de_jeu extends Panel implements Observer{
	
	Button[] boutonTab;
	
	public Plateau_de_jeu(Modele m) {
		super();
		this.setPreferredSize(new Dimension(640,360));
		this.setLayout(new FlowLayout());
		
		boutonTab = new Button[15];
		for (int i=0; i<15; i++) {
			boutonTab[i] = new Button("");
			boutonTab[i].setBackground(Color.gray);
			boutonTab[i].setBounds(50,100,80,30);  
			add(boutonTab[i]);
		}
		}
		

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
