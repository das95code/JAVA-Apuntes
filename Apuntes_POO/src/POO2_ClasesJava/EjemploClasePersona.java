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
Creamos la clase persona, con sus atributos (encapsulación privada), constructores y getters y setters.
Sobreescribir el método toString (con @Override) para proporcionar los datos a los diferentes objetos Persona.
*/
public class EjemploClasePersona {
    
    //Primero, creamos los atributos.
    private String nombre;
    private String apellidos;
    private String DNI;
    private String correo;
    private int telefono;
    
    //Después creamos el constructor. En este caso, será parametrizado.

    public EjemploClasePersona(String nombre, String apellidos, String DNI, String correo, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    //Creamos los getter y los setter.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    //Creamos los métodos. En este caso solo crearemos un método: respirar.
    
    public void respirar(){    //Void porque no devuelve nada.
        System.out.println(nombre + " " + apellidos + " inhala oxígeno y exhala dióxido de carbono.");
    }
    
    //Sobrescribimos el método toString con override para proporcionar los datos a los diferentes objetos.
    
    @Override
    public String toString(){
        String texto = "";  //Creamos un String vacío que iremos llenando mediante el método de autoasignación "+=".
        texto += "Nombre:  " + nombre + "\n";
        texto += "Apellidos:  " + apellidos + "\n";
        texto += "DNI:  " + DNI + "\n";
        texto += "Correo:  " + correo + "\n";
        texto += "Teléfono:  " + telefono;
        return texto; //Devolvemos el texto.
    }
    
}
