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
		System.out.print(linea.distanciaEntrePuntos());
	}

}