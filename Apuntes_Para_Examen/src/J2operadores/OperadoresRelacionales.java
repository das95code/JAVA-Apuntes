/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J2operadores;

/**
 *
 * @author david
 */
public class OperadoresRelacionales {
    
    /* Los operadores relacionales funcionan exactamente como en Python, se utilizan en estructuras de control (if y bucles).
    Veamos a continuación algunos ejemplos.
    */
    
    public static void main(String[] args) {
       
        //Creamos primero dos variables int:
        
        int numero1 = 20;
        int numero2 = 10;
        
        //Creemos ahora una serie de prints en base a las distintas estructuras de control.
        
        if (numero1 > numero2){
            System.out.println("Numero1 es mayor que Numero2.");
        }
        
        if (numero2 < numero1) {
            System.out.println("Numero2 es menor que Numero1.");
        }
        
        if (numero1 != numero2) {
            System.out.println("Numero1 es distinto que Numero2.");
        }
       
        System.out.println("____________________________________________");
        
        //Pongamos ahora un ejemplo más tangible.
        
        int temperatura = 22;
        
        if (temperatura >= 22){
            System.out.println("Hace calor.");
        }
        
        if (temperatura < 22) {   
            System.out.println("Hace frio.");
        }
        
        //En este caso, y debido a los operadores relacionales, hará calor.
    }
}
