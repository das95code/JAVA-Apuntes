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
La clase mano contendrá un array de dedos, y cada posición del array será un nuevo dedo creado con el constructor de su clase.
Por tanto, el atributo de la mano será unicamente un array dedos de 5 posiciones.
*/
public class Mano {
    
    //Atributo:
    private Dedo[] dedos;
    
    public Mano() {
    
    dedos = new Dedo[5];
    
    dedos[0] = new Dedo (1, "Pulgar");
    dedos[1] = new Dedo (2, "Indice");
    dedos[2] = new Dedo (3, "Corazon");
    dedos[3] = new Dedo (4, "Anular");
    dedos[4] = new Dedo (5, "Meñique");
}
    
    @Override
    
    public String toString(){
    
    String texto = "";
    
    for (Dedo dedo : dedos){
    texto += dedo.toString() + "\n";
}
    return texto;
    }  
    
}
