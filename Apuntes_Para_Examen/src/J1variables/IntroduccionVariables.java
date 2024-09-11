/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1variables;

/**
 *
 * @author david
 */
public class IntroduccionVariables {

    /**
     * En una variable se almacenan valores que pueden CAMBIAR. Primitivas y
     * referenciadas. Nunca debemos nombrar una variable con un número al
     * principio ni ser una palabra reservada. Se permiten los símbolos $ y _
     *
     * Las variables pueden ser: - Globales: Los llamados atributos, variables
     * miembro o variables de instancia. Afectan a toda la clase. - Finales:
     * Constantes. - Locales: se definen dentro de un método, constructor o
     * bloque. Afectan solo dentro del método.
     *
     * Cuando una variable local y global tienen el mismo nombre, se produce una
     * ambigüedad que se soluciona con el operador this.
     * 
     VARIABLES:
     
     -Del tipo numérico:
     * Byte - (8)
     * Short - (16)
     * Int - (32)
     * Long - (64)
     * Float - (32f)
     * Double - (64d)
     
     -No numéricas:
     * Char - (1 caracter)
     * String - Cadena de texto
     * Boolean - (del tipo booleano. 0 negativo, 1 positivo) Siempre inicia en false
     * 
     */
    //Las variables se deben declarar de la siguiente manera:
    //Una vez declarada, la podemos utilizar.
    
    
    public static void main(String[] args) {
        int cifra = 5;
        float numero = 9.5F; //Usamos la F o la D para indicar un float o double.
        String nombre = "David Alcázar Sánchez";
        System.out.println("El alumno " + nombre + " ha sacado la siguiente nota: " + numero);
        System.out.println("La suma de " + cifra + " + 5 = " + (cifra + 5));
    }

}
