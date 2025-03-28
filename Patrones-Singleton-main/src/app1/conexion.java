/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app1;

/**
 *
 * @author Estudiantes
 */
public class conexion {
    
    private static conexion parametro;
    
    private conexion(){
        
    }
    
    //Singleton, escoje el parametro del main y actua segun la condicion
    public static conexion getparametro(){
        if(parametro == null){
            parametro = new conexion();
        }
        return parametro;
    }
    
    public void conectar(){
        System.out.println("Conectado a la base de datos.");
    }
    
    public void desconectar(){
        System.out.println("Desconectado a la base de datos.");
    }
    
}
