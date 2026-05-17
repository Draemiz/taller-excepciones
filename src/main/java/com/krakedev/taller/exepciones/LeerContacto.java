package com.krakedev.taller.exepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerContacto {

    private static final Logger log =
            LoggerFactory.getLogger(LeerContacto.class);

    public static void leerContactos() {

        BufferedReader lector = null;

        try {

            FileReader archivo =
                    new FileReader("contactos.txt");

            lector = new BufferedReader(archivo);

            String linea;

            while ((linea = lector.readLine()) != null) {

                System.out.println(linea);

            }

            log.info("INFO: Archivo leído correctamente");

        } catch (FileNotFoundException e) {

            log.error("INFO: Archivo no encontrado");

        } catch (IOException e) {

            log.error("INFO: Error al leer archivo");

        } finally {

            try {

                if (lector != null) {
                    lector.close();
                }

            } catch (IOException e) {

                log.error("INFO: Error al cerrar lector");

            }

        }

    }

}