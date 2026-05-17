package com.krakedev.taller.exepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	
	private static final Logger log =
            LoggerFactory.getLogger(Test.class);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String telefono = "123";

	        try {

	            ValidarContacto.validarTelefono(telefono);

	            GuardarContacto.guardarContacto(
	                    "Maria",
	                    "Gomez",
	                    telefono);

	            LeerContacto.leerContactos();

	            log.info("¡¡PROCESO EJECUTADO CORRECTAMENTE!!");

	        } catch (IllegalArgumentException e) {

	            log.error(e.getMessage());

	        }

	}

}
