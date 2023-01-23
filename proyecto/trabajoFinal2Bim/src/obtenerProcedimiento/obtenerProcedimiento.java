/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obtenerProcedimiento;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class obtenerProcedimiento {

    public static void crearTwitter() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String nombreUsuario;
        String apellido;
        int edad;
        String ciudad;
        String pais;
        String correo;
        String idioma;

        System.out.println("Ingrese su nombre de usuario:");
        usuario = entrada.nextLine();
        System.out.println("Ingrese sus nombres completos:");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese sus apellidos completos:");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su idioma:");
        idioma = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        System.out.printf("Nombre de usuario: %s\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "País: %s\n"
                + "Idioma: %s\n"
                + "Correo electrónico: %s\n", usuario, nombreUsuario, apellido, edad, ciudad,
                pais, idioma, correo);
    }

    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        String pais;
        int telefono;
        int edad;
        String interes;

        System.out.println("Ingrese su nombre de usuario:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        telefono = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el país:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su área de interés:");
        interes = entrada.nextLine();

        System.out.printf("Nombre de usuario: %s\n"
                + "Número de teléfono: %d\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "País: %s\n"
                + "Área de interés: %s\n", nombre, telefono,
                edad, ciudad, pais, interes);
    }

    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String ciudad;
        String correo;

        System.out.println("Ingrese su nombre de usuario:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        System.out.printf("Nombre de usuario: %s\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "Correo electrónico: %s\n", nombre,
                edad, ciudad, correo);
    }
}
