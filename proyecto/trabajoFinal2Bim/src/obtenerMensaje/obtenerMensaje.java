/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obtenerMensaje;

/**
 *
 * @author DELL
 */
public class obtenerMensaje {
public static String obtenerCadena(int elementos){
        String[] mensajeFinal = {"Campaña con poca afluencia\n", 
            "Campaña moderada siga adelante\n", "Excelente campaña\n"};
        if(elementos >= 1 && elementos <= 5){
            return mensajeFinal[0];
        }else if(elementos >= 6 && elementos <= 15){
            return mensajeFinal[1];
        }else if(elementos >= 16){
            return mensajeFinal[2];
        }
        return "Error con los elementos\n";
    }
}
