package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados{

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Realiza las tareas correspondientes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Genera un informe";
	}

}
