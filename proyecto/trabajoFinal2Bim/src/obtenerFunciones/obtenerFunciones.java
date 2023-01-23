/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obtenerFunciones;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class obtenerFunciones {

    public static String crearFacebook() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        int edad;
        String ciudad;
        String pais;
        String correo;
        String cadenaFinal = "";

        System.out.println("Ingrese su nombre de usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la ciudad donde vive:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el país donde vive:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        cadenaFinal = String.format("Nombre de usuario en Facebook es: %s\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "País: %s\n"
                + "Correo electrónico: %s\n", nombreUsuario, edad, ciudad,
                pais, correo);
        return cadenaFinal;
    }

    public static String crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String ciudad;
        String pais;
        int edad;
        int telefono;
        String cadenaFinal;

        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        telefono = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la ciudad en donde vive:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el país donde vive:");
        pais = entrada.nextLine();

        cadenaFinal = String.format("Nombre de usuario en Whatsapp es: %s\n"
                + "Número de teléfono: %d\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "País: %s\n", nombreUsuario, telefono, edad, ciudad,
                pais);
        return cadenaFinal;
    }

    public static String crearSignal() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        int edad;
        int telefono;
        String ciudad;
        String pais;
        String hobby;
        String cadenaFinal;

        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        telefono = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la ciudad donde vive:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el país donde vive:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su pasatiempo principal:");
        hobby = entrada.nextLine();

        cadenaFinal = String.format("Nombre de usuario en Signal es: %s\n"
                + "Número de teléfono: %d\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "País: %s\n"
                + "Hobby principal: %s\n", nombreUsuario, telefono,
                edad, ciudad, pais, hobby);
        return cadenaFinal;

    }

    public static String crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String correo;
        String nombreUsuario;
        String cadenaFinal;

        System.out.println("Ingrese su nombre de usuario:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        cadenaFinal = String.format("Nombre de usuario en Flickr es: %s\n"
                + "Correo electrónico: %s\n", nombreUsuario, correo);
        return cadenaFinal;
    }
}
