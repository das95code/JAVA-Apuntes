/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J2operadores;

/**
 *
 * @author david
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        
        /*Al igual que con python, utilizamos & (and) y | (or) como operadores lógicos especialmente dentro de bucles y unidades de control.
        Debemos diferenciar entre el operador torpe '&', '|' y el operador inteligente '&&' y '||'.
        En el operador torpe, siempre se evaluan los dos operadores.
        En el operador inteligente, se evaluará un solo operador en el caso de que el resultado quede fijo sea cual sea el segundo operador.
        */
        
        //Hagamos la prueba creando dos variables booleanas:
        
        boolean x = true;
        boolean y = false;
        
        System.out.println("x & y = " + (x&y)); 
        System.out.println("x | y = " + (x|y)); 
        System.out.println("x! = " + (!x));
        
        //Si con el operador inteligente (&&) el primer operador es false, el segundo ya no se evalúa. 
        System.out.println("y && x = " + (y&&x));
        //Por el contrario, si con el operador inteligente (||) el primer operador es true, el segundo ya no se evalúa.
        System.out.println("x || y = " + (x||y));
    }
}
