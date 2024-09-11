/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J2operadores;

/**
 *
 * @author david
 */
public class Operadores {
    
    /*
    OPERADORES:
    
    Operador Unario: 
        -Autoincrementales - ++x, x++, --x, x--; Dependiendo de donde se encuentre el incremento, primero asigna y luego incrementa o viceversa (y = x++ no es lo mismo que y = ++x).
    
    Operador Binario:
        -Relacionales - <, >, <=, >=, ==, !=; Resultan en un booleano.
        -Aritméticos - +, -, *, /, %, =; Resultan en un número.
        -Lógicos && (and inteligente), & (and torpe), || (or inteligente), | (or torpe), ! (not); Resultan en un booleano.
    
    Operador Ternario:
        Se construye de la siguiente manera --> (condición)? valor_si_es_true : valor_si_es_false;
        Por ejemplo: String aprobado = (nota >= 5)? "SI" : "NO";
    */
    
    //Vamos a declarar también una par de variables constantes con la que operar:
    
    static final double k = 20;
    
    public static void main(String[] args) {
        
        int numero1 = 5;
        int numero2 = 15;
        
        int resultado = numero1 + numero2;
        double resultado2 = resultado + k;
        
        System.out.println("El resultado de la suma de " + numero1 + " + " + numero2 + " = " + resultado);
        System.out.println("La suma del resultado anterior a nuestra constante " + k + " da como resultado " + resultado2);
        
        System.out.println("_________________________________________________________");
        
        System.out.println("PRUEBA DE AUTOINCREMENTAL");
        
        int x = numero1++; //Aquí opera primero y luego incrementa, así que x será igual a 5.
        numero1 = 5; //Debemos devolver a numero1 su valor original, ya que una vez incrementado se guarda el nuevo valor.
        int y = ++numero1; //Aquí incrementa antes de operar, por lo que y valdrá 6.    
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(numero1); //Podremos comprobar que ahora numero1 vale 6
    }
    
}
