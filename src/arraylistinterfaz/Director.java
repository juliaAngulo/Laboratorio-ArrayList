
package arraylistinterfaz;


public class Director {
    private String director;

    public Director(String director) {
        this.director = director;
    }
     public String toString() {
        return ("Director: " + director);
    }

    public String getDirector() {
        return director;
    }
}
