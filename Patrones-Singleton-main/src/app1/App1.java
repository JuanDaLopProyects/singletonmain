/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app1;

/**
 *
 * @author Estudiantes
 */
public class App1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexion c =conexion.getparametro();
        c.conectar();
        
        
        boolean respuesta = c instanceof conexion;
        System.out.println(respuesta);
    }
    
}
