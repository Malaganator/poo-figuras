import java.util.Vector;
import java.awt.*;
import geometria.*;

/**
 * figuras
 */
public class Figuras {
	public static void main(String[] args) throws InterruptedException {
		Punto punto1  = new Punto(7, 5);
		Punto punto2 = new Punto(4, 1);
		
		Linea linea = new Linea(punto1, punto2);
		Linea linea2 = new Linea(punto1, punto2);
		Rectangulo rectangulo = new Rectangulo(linea, linea2);
		System.out.print(linea.distanciaEntrePuntos());
	}

}