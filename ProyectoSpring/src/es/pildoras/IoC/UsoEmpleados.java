package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class UsoEmpleados {

	public static void main(String[] args) {
		
		
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados Juan=(Empleados) contexto.getBean("miEmpleado", Empleados.class);
		
	}

}
