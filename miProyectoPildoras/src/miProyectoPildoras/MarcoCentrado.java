package miProyectoPildoras;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MarcoCentrado extends JFrame {
	public MarcoCentrado() {
		setVisible(true);
		setSize(600,450);
		setLocation(400, 200);
		setTitle("Primer texto");
		
		Lamina miLamina = new Lamina();
		add(miLamina);
		
	}
}

class Lamina extends JPanel {
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.drawString("Estoy aprendiendo SWING", 50, 50);	
	}
}