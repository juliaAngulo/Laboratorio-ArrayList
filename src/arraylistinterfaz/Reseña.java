
package arraylistinterfaz;


public class Reseña {
    private String resena; 

    public Reseña(String resena) {
        this.resena = resena;
    }
      public String toString() {
        return ("Reseña: " + resena);
    }

    public String getReseña() {
        return resena;
}
}
