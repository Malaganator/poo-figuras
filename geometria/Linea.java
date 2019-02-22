package geometria;

/**
 * Linea Recta
 */
public class Linea {
    private Punto punto1, punto2;
    private double pendiente;

    public Linea(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.calcularPendiente();
    }

    public Linea(Punto punto1, double pendiente){
        this.punto1 = punto1;
        this.pendiente = pendiente;
        this.calcularOtroPunto();
    }

    private void calcularOtroPunto(){
        this.punto2 = new Punto(0, 0);
    }

    private void calcularPendiente(){
        double y_y = (this.punto2.getY() - this.punto1.getY());
        double x_x = (this.punto2.getX() - this.punto1.getX());
        this.pendiente = y_y / x_x ;
    }

    public double distanciaEntrePuntos(){
        return Math.sqrt((Math.pow((this.punto2.getX() - this.punto1.getX()), 2)) + (Math.pow(this.punto2.getY() - this.punto1.getY(), 2)));
    }

    public double getPendiente() {
        return this.pendiente;
    }

    public void setPendiente(double pendiente){
        this.pendiente = pendiente;
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