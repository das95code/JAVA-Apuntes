/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO3_Encapsulacion;

/**
 *
 * @author david
 */
public class ModificadoresDeEncapsulacion {
        /*Sirven para ocultar o prohibir el acceso a los miembros de la clase. Se establece un nivel de privacidad, de más oculto a más visible:
    
    private -> "default" -> protected -> public
    
    El private es solo visible por la propia clase.
    El "default" es visible tanto por la propia clase como por las que pertenezcan a su mismo paquete.
    El protected se trata de un private que se hereda. La clase hija puede usar algo de la madre a través de una instancia propia.
    --EN LA CLASE PROTECTED--:
            - Si está en el mismo paquete que la madre, es visible por la clase madre y por todas las demás clases del paquete, hereden o no. (Default es más restrictivo que protected).
            - Si no está en el mismo paquete que la madre, es visible por la clase madre y las clases hijas, pero a través de una instancia de la clase hija, nunca de la madre.
              El resto de clases deno tendrán acceso al atributo o método.
    
    El public es visible por todas las clases de cualquier paquete.
    
    
   (Relativo al protected)
    El nivel de encapsulación PROTECTED referencia a algo que podremos utilizar en una clase heredera y sus subclases, sin importar el paquete donde se encuentren.
    Las clases herederas siempre harán uso de las herencias protected a través de una INSTANCIA PROPIA (un objeto de su propia clase), nunca de una instancia de la madre.
    Los constructores NO SE HEREDAN, aunque sí que podemos invocar un constructor protegido con super(x)

*/
}
