package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer el xml de configuración
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		//Pedir un bean al contenedor
		Empleados Antonio=contexto.getBean("ComercialExperimentado", Empleados.class);
		
		//Usar el bean
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		//Cerrar el contexto
		
		contexto.close();

	}

}
