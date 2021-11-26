package miProyectoPildoras.fuentes;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class ConocerFuentes {

	public static void main(String[] args) {
		String miFuente =JOptionPane.showInputDialog("Introduce una fuente");
		boolean existeFuente = false;
		
		String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for (String fuente : fuentes) {
			if(fuente.equals(miFuente)) {
				existeFuente=true;
			}
		}
		
		if(existeFuente) {
			System.out.println("Fuente instalada");
		}else {
			System.out.println("No esta instalada la fuente");
		}
	}

}
