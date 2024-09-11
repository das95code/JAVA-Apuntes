/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO2_ClasesJava;

/**
 *
 * @author david
 */
public class EjemploPruebaPersona {
    
    //Creamos el main
    
    public static void main(String[] args) {
        
        EjemploClasePersona persona1 = new EjemploClasePersona("María", "De la O", "47522857Z", "mariadelao@gmail.com", 667985043);
   
        System.out.println(persona1);
        
        //Vamos a intentar cambiar el teléfono de María. Al ser teléfono un atributo PRIVADO de la clase PruebaPersona, no podemos poner:
        
        //persona1.telefono = 667667667;  //Si descomentamos esto, dará un error que nos indicará que no podemos cambiar de esa forma un atributo privado.
        //Para poder cambiar dicho atributo, debemos acceder a los SETTERS antes creados.
        
        persona1.setTelefono(667667667); //Ahora sí, hemos podido cambiar el teléfono. Volvemos a imprimir "persona1" para comprobar que se ha cambiado el atributo.
        
        System.out.println(persona1);
        
        //Por último, probaremos el método creado.
        
        persona1.respirar();
        
    }
    
}
