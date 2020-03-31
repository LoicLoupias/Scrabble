import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

public class Plateau_de_jeu extends Canvas implements Observer{
	
	public Plateau_de_jeu(Modele m) {
		super();
		this.setPreferredSize(new Dimension(640,360));
		
		m.addObserver(this);
	}
	
	public void paint(Graphics g) {
		int x1=this.getWidth()/15;
		int y1=this.getHeight()/15;
		int x=0;
		int y=0;
		for (int i=0; i<15; i++) {
			g.drawLine(x,0,x,this.getHeight());
			g.drawLine(0, y, this.getWidth(),y);
			x = x + x1;
			y = y + y1;
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}