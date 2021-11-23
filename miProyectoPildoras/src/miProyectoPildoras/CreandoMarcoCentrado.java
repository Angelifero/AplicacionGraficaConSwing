package miProyectoPildoras;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MarcoCentrado miMarco = new MarcoCentrado();

	}

	class MarcoCentrado extends JFrame {
		public MarcoCentrado() {
			Toolkit miPantalla=Toolkit.getDefaultToolkit();
			miPantalla.getScreenSize();
			
			Dimension tamanioPantalla=miPantalla.getScreenSize();
			
		}
	}
}
