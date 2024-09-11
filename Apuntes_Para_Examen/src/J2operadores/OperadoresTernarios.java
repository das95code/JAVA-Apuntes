/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J2operadores;

/**
 *
 * @author david
 */
public class OperadoresTernarios {
    public static void main(String[] args) {
        
        /*El operador ternario es equivalente a un condicional if-else.
        Su estructura más simple es (condición)? se cumple:no se cumple, pero se puede anidar colocando ternarios dentro de ternarios.
        Veamos un ejemplo:*/
        
        int sueldo = 5000;
        
        String opinion = (sueldo>2000)?"BUENO":"MALO";
        
        System.out.println("Un sueldo de " + sueldo + " es " + opinion);
        
        //Veamos un ejemplo más elaborado con ternarios anidados:
        
        int sueldo2 = 6000;
        
        String opinion2 = (sueldo>2000)?
                ((sueldo >=5000)?"MUY BUENO":"BUENO")
                :"MALO";
        
        System.out.println("Un sueldo de " + sueldo2 + " es " + opinion2);
             
    }
}
