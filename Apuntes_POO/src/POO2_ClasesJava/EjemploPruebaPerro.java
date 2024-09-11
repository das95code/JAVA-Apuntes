/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO2_ClasesJava;

/**
 *
 * @author david
 */

/*
En esta clase probaremos a crear distintos objetos perro y a llamar a los diferentes métodos que hemos creado.
*/
public class EjemploPruebaPerro {
    
    public static void main(String[] args) { //Primeramente creamos un main. Es en las clases principales donde escribiremos el código de nuestro programa llamando a los difrentes métodos.
        
        EjemploClasePerro Pipo = new EjemploClasePerro("Pipo", "Caniche Toy", 12);
        EjemploClasePerro Goofy = new EjemploClasePerro("Goofy", "Mestizo", 8);
        
        System.out.println("Los perros son: ");
        System.out.println(Pipo);            //Se muestran los distintos datos de cada objeto por el @Override.
        System.out.println(Goofy);
        
        System.out.println("_________________________________________________________");
        
        //Probemos ahora los distintos métodos.
        
        Pipo.ladrar();
        
        Goofy.comer("croquetas");
        
        Pipo.comer("pienso");
        
    }
    
}
