package miProyectoPildoras;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoBotones extends JFrame{
	public MarcoBotones(){
		setTitle("Botones y eventos");
		setBounds(700, 300, 500, 300);
		
//		LaminaBotones miLamina=new LaminaBotones();
//		add(miLamina);
		
	}
}

class LaminaBotones extends JPanel{
	JButton botonAzul=new JButton("Azul");
	JButton botonRojo=new JButton("Rojo");
	JButton botonAmarillo=new JButton("Amarillo");
	JButton botonVerde=new JButton("Verde");
	
	public LaminaBotones() {
		add(botonAzul);
		add(botonRojo);
		add(botonAmarillo);
		add(botonVerde);
		
		ColorDeFondo Azul=new ColorDeFondo(Color.blue);
		ColorDeFondo Rojo=new ColorDeFondo(Color.red);
		ColorDeFondo Amarillo=new ColorDeFondo(Color.yellow);
		ColorDeFondo Verde=new ColorDeFondo(Color.green);
		
		
		botonAzul.addActionListener(Azul);
		botonRojo.addActionListener(Rojo);
		botonAmarillo.addActionListener(Amarillo);
		botonVerde.addActionListener(Verde);
	}

 private class ColorDeFondo implements ActionListener{
		
		private Color colorDeFondo;
		public ColorDeFondo(Color c) {
			colorDeFondo=c;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
		}
	}
	
}