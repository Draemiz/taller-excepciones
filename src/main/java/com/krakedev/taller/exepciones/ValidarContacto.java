package com.krakedev.taller.exepciones;

public class ValidarContacto {

    public static void validarTelefono(String telefono)
            throws IllegalArgumentException {

        if (telefono.length() != 10) {

            throw new IllegalArgumentException(
                    "INFO: El telefono debe tener 10 digitos");

        }

    }

}