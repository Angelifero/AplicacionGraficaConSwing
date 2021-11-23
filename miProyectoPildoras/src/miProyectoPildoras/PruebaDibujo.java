package miProyectoPildoras;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaDibujo {

	public static void main(String[] args) {
		MarcoNuevo marcoNuevo = new MarcoNuevo();
		marcoNuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoNuevo extends JFrame {
	public MarcoNuevo() {
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer texto");
		LaminaNueva laminaNueva = new LaminaNueva();
		add(laminaNueva);
	}
}

class LaminaNueva extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangle2d = new Rectangle2D.Double(100, 100, 200, 150);

		g2.draw(rectangle2d);

		Ellipse2D ellipse2d = new Ellipse2D.Double();
		ellipse2d.setFrame(rectangle2d);
		g2.draw(ellipse2d);
		g2.draw(new Line2D.Double(100, 100, 300, 250));

		double centroEnX = rectangle2d.getCenterX();
		double centroEnY = rectangle2d.getCenterY();
		double radio = 150;

		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX + radio, centroEnY + radio);
		g2.draw(circulo);

	}
}