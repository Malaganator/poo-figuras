package geometria;
/**
 * Linea
 */
public class Linea {
    private Punto punto1;
    private Punto punto2;

    public Linea(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Punto getPunto1() {
        return this.punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return this.punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }  
}