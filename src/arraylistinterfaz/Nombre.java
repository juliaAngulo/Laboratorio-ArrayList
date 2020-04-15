
package arraylistinterfaz;

public class Nombre {
    private String nombre; 
   

    public Nombre(String nombre) {
        this.nombre = nombre;
        
    }
    public String toString() {
        return ("Nombre: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }
}
