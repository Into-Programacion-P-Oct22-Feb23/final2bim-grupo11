/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impresionFinal;

import java.util.Scanner;
import obtenerFunciones.obtenerFunciones;
import obtenerProcedimiento.obtenerProcedimiento;
import obtenerMensaje.obtenerMensaje;

/**
 *
 * @author DELL
 */
public class impresionFinal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion;
        boolean bandera = true;
        int contador = 0;
        int opcionDos;
        String mensaje;

        while (bandera) {
            contador++;
            System.out.printf("""
                              Ingrese 1 para crear una cuenta en Facebook
                              Ingrese 2 para crear una cuenta en Twitter
                              Ingrese 3 para crear una cuenta en Whatsapp
                              Ingrese 4 para crear una cuenta en Telegram
                              Ingrese 5 para crear una cuenta en Signal
                              Ingrese 6 para crear una cuenta en Instagram
                              Ingrese 7 para crear una cuenta en Flickr
                              """);
            opcion = entrada.nextInt();

            if (opcion == 1) {
                mensaje = obtenerFunciones.crearFacebook();
                contador = contador + 1;
                System.out.println(mensaje);
            } else if (opcion == 2) {
                contador = contador + 1;
                obtenerProcedimiento.crearTwitter();
            } else if (opcion == 3) {
                contador = contador + 1;
                mensaje = obtenerFunciones.crearWhatsapp();
                System.out.println(mensaje);
            } else if (opcion == 4) {
                contador = contador + 1;
                obtenerProcedimiento.crearTelegram();
            } else if (opcion == 5) {
                contador = contador + 1;
                mensaje = obtenerFunciones.crearSignal();
                System.out.println(mensaje);
            } else if (opcion == 6) {
                contador = contador + 1;
                obtenerProcedimiento.crearInstagram();
            } else if (opcion == 7) {
                contador = contador + 1;
                mensaje = obtenerFunciones.crearFlickr();
                System.out.println(mensaje);
            } else {
                System.out.println("Error, esa opción no es valida.");
                contador = contador + 0;
            }

            System.out.println("Ingrese 1 para salir, de lo contrario 2.");
            opcionDos = entrada.nextInt();

            if (opcionDos == 1) {
                bandera = false;
            }
        }
        if (contador > 0) {
            mensaje = obtenerMensaje.obtenerCadena(contador);
            System.out.printf("Con número de cuentas %d es: %s",
                    contador, mensaje);
        } else {
            mensaje = obtenerMensaje.obtenerCadena(0);
            System.out.printf("Con número de cuentas 0 es: %s",
                    mensaje);
        }

    }

}
