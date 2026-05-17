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

    public static boolean leerContactos() {

        BufferedReader lector = null;

        try {

            FileReader archivo =
                    //new FileReader("contactos.txt");
            		new FileReader("fantasma.txt");

            lector = new BufferedReader(archivo);

            String linea;

            while ((linea = lector.readLine()) != null) {

                System.out.println(linea);

            }

            log.info("Archivo leído correctamente");

            return true;

        } catch (FileNotFoundException e) {

            log.error("Archivo no encontrado");

            return false;

        } catch (IOException e) {

            log.error("Error al leer archivo");

            return false;

        } finally {

            try {

                if (lector != null) {

                    lector.close();

                }

            } catch (IOException e) {

                log.error("Error al cerrar lector");

            }

        }

    }

}