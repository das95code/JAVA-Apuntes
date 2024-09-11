/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO2_5_VariosAnillos;

/**
 *
 * @author david
 */

/*
La clase dedo se compondrá de tres atributos: número de dedo, nombre del dedo y anillo, que será un atributo del tipo anillo (ya creado).
Crearemos también el constructor del dedo. El objeto anillo se creará automáticamente y de manera aleatoria al crear un dedo.
También sobrescribiremos el método toString para mostrar los atributos de cada dedo.
*/
public class Dedo {
    //Creamos los atributos.
    private String nombre;
    private int posicion;
    private Anillo anillo;

    //Creamos el constructor del dedo.
    public Dedo(int posicion, String nombre) {
        this.nombre = nombre;
        this.posicion = posicion;
        anillo = new Anillo(); //El anillo se creará automáticamente.
    }
    
    //Sobreescribimos el método toString.
    @Override
    public String toString(){
        String texto = posicion + " - " + nombre;
        String textoAnillo = anillo.toString();
        
        if ("Anillo de Ninguno".equals(textoAnillo)){ //Si el anillo es "ninguno", no hay ningún anillo y devolveremos solo los atributos del dedo.
            return texto;
        }
        
        return texto + " - " + textoAnillo;
    }
}
