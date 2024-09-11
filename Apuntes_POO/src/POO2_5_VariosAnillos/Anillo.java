/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO2_5_VariosAnillos;


/**
 *
 * @author david
 */

/*ANTES DE NADA VAMOS A EMPEZAR POR EL OBJETO MÁS PEQUEÑO (el que depende de más clases y nadie depende de él)
En este caso, el objeto anillo.
Un anillo tiene dos atributos, su material y su medida, que juntaremos en un único atributo String tipoanillo.
*/

public class Anillo {
       
//Creamos sus atributos
    
    private String tipoanillo;
    private String numeromedida;
    private final String[] material = {  //Creamos un array con los distintos materiales posibles (también incluiremos ninguno, para tener la posibilidad de no tener anillo.
    "Madera", "Plata", "Oro", "Zafiro", "Rubí", "Esmeralda", "Diamante", "Ninguno"
};
    
    public Anillo(){ //Creamos un método para crear un nuevo anillo, de un material aleatorio entre la lista y con una medida aleatoria entre 1 y 32.
        int aleatorio = (int)(Math.random() * material.length);
        tipoanillo = "Anillo de " + material[aleatorio];
        //int medida = (int) (Math.random() * 32);
        //numeromedida = " de medida " + medida;
    }
    
    @Override //Con una sobreescritura del método string (@Override), podremos obtener los datos de cada anillo creado.
    public String toString(){
        return tipoanillo;
    }
}
