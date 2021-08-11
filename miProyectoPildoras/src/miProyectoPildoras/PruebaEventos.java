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
		
		LaminaBotones miLamina=new LaminaBotones();
		add(miLamina);
		
	}
}

class LaminaBotones extends JPanel implements ActionListener{
	JButton botonAzul=new JButton("Azul");
	JButton botonRojo=new JButton("Rojo");
	JButton botonAmarillo=new JButton("Amarillo");
	JButton botonVerde=new JButton("Verde");
	
	public LaminaBotones() {
		add(botonAzul);
		add(botonRojo);
		add(botonAmarillo);
		add(botonVerde);
		
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonVerde.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object botonPulsado=e.getSource();
		
		if(botonPulsado==botonAzul) {
			setBackground(Color.blue);
		}
		else if(botonPulsado==botonRojo) {
			setBackground(Color.red);
		}
		else if(botonPulsado==botonAmarillo) {
			setBackground(Color.yellow);
		}
		else if(botonPulsado==botonVerde) {
			setBackground(Color.green);
		}
		
		
	}
	
}
