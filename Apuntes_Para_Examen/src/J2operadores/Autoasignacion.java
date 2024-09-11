/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J2operadores;

/**
 *
 * @author david
 */
public class Autoasignacion {
    
    public static void main(String[] args) {       

    
    /* Es importante conocer como funciona el factor de autoasignación en Java.
       Si asignamos una variable con el operador +=, el valor resultante adquirirá el mismo tipo del que es la variable al que se le asigna.
       Por ejemplo:
    */
    byte numero1 = 1;
    int numero2 = 2;
    long numero3 = 3;
    short numero4 = 4;
    
    int resultado = 0;
    
    resultado += numero1;
    resultado += numero2;
    resultado += numero3;
    resultado += numero4;
    
        System.out.println("Resultado = " + resultado);
    
  }  
}
