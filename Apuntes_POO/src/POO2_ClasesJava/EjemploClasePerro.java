/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO2_ClasesJava;

/**
 *
 * @author david
 */


/* Vamos a crear una clase de ejemplo perro, a la que dotaremos de atributos (con encapsulación privada) un constructor, getters and setters 
   y los métodos ''ladrar'' y ''comer''.
   También sobreescribiremos el método toString() (con @override) para obtener la información de cada objeto perro creado.
*/
public class EjemploClasePerro {
    
    //Creamos primero los atributos (con encapsulación privada).
    
    private String nombre;
    private String raza;
    private int edad;
    
    //Creamos el constructor. Puede ser parametrizado o por defecto. 

    public EjemploClasePerro() {  //Constructor por defecto.
    }

    public EjemploClasePerro(String nombre, String raza, int edad) { //Constructor parametrizado.
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    //Creamos los getters y los setters.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 16){
            System.out.println("La edad " + edad + " no es posible."); //Creamos un pequeño bucle de control, porque los perros no pueden tener más de 16 años.
        }
        this.edad = edad;
    }
    
    
    //Creamos ahora los dos métodos ladrar y comer.
    
    public void ladrar(){
        System.out.println("GUAU! GUAU!");
    }
    
    public boolean comer(String comida){ //Es boolean porque el perro solo come pienso.
        if ("pienso".equals(comida)){
            System.out.println(nombre + " come pienso.");
            return true;
        }
        else {
            System.out.println(nombre + " no quiere comer " + comida + ".");
            return false;
        }
    }
    
    //Por último, creamos la sobreescritura al método toString (con @override) para conseguir los datos de cada objeto perro.
    
    @Override
    public String toString(){ //Devolvemos el estado del objeto.
        return "NOMBRE: " + nombre + " RAZA: " + raza + " EDAD: " + edad;
    }   
    
}
