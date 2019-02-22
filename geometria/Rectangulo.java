package geometria;

import java.util.ArrayList;

/**
 * Rectangulo
 */
public class Rectangulo {

	private Linea lineaRigth, lineaLeft, lineaUp, lineaDown;
	private Punto verticeUpR, verticeUpL, verticeDownR, verticeDownL;

	public Rectangulo(Linea abajo, Linea izquierda) {
		this.lineaLeft = izquierda;
		this.lineaDown = abajo;
		this.construirRectangulo();
	}

	public Rectangulo(
		Punto vertice_up_r,
		Punto vertice_up_l,
		Punto vertice_down_r,
		Punto vertice_down_l){
			this.verticeUpR = vertice_up_r;
			this.verticeUpL = vertice_up_l;
			this.verticeDownR = vertice_down_r;
			this.verticeDownL = vertice_down_l;
	}

	private void construirRectangulo(){

		if(this.verticeEnComun()){
			System.out.print("Todo es verdad");
		}

	}

	private boolean verticeEnComun(){
		if(this.lineaDown.getPunto2() == this.lineaLeft.getPunto2()){
			return true;
		}else if(this.lineaDown.getPunto2() == this.lineaLeft.getPunto1()){
			return true;
		}else if(this.lineaDown.getPunto1() == this.lineaLeft.getPunto1()){
			return true;
		}else if(this.lineaDown.getPunto1() == this.lineaLeft.getPunto1()){
			return true;
		}else{
			return false;
		}
		
	}

	public Linea getLineaRigth() {
		return this.lineaRigth;
	}

	public void setLineaRigth(Linea lineaRigth) {
		this.lineaRigth = lineaRigth;
	}

	public Linea getLineaLeft() {
		return this.lineaLeft;
	}

	public void setLineaLeft(Linea lineaLeft) {
		this.lineaLeft = lineaLeft;
	}

	public Linea getLineaUp() {
		return this.lineaUp;
	}

	public void setLineaUp(Linea lineaUp) {
		this.lineaUp = lineaUp;
	}

	public Linea getLineaDown() {
		return this.lineaDown;
	}

	public void setLineaDown(Linea lineaDown) {
		this.lineaDown = lineaDown;
	}

	public Punto getVerticeUpR() {
		return this.verticeUpR;
	}

	public void setVerticeUpR(Punto verticeUpR) {
		this.verticeUpR = verticeUpR;
	}

	public Punto getVerticeUpL() {
		return this.verticeUpL;
	}

	public void setVerticeUpL(Punto verticeUpL) {
		this.verticeUpL = verticeUpL;
	}

	public Punto getVerticeDownR() {
		return this.verticeDownR;
	}

	public void setVerticeDownR(Punto verticeDownR) {
		this.verticeDownR = verticeDownR;
	}

	public Punto getVerticeDownL() {
		return this.verticeDownL;
	}

	public void setVerticeDownL(Punto verticeDownL) {
		this.verticeDownL = verticeDownL;
	}
	
}