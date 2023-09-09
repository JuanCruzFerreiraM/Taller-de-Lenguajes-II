/**
 * <h1 align="center"> Bouncy Balls</h1>
 * La clase BouncyBalls genera una animacion de una bolita que rebota
 * haciendo uso de la libreria stdlib.jar
 * <p>
 * @author Juan Cruz Ferreira Monteiro
 * @version 1.0
 */
public class BouncyBalls {
     
	public static void main(String[] args) {
	// set the scale of the coordinate system
        StdDraw.setXscale(-2.0, 2.0);
        StdDraw.setYscale(-2.0, 2.0);

        // initial values
        double posicionX = 0.480, posicionY = 0.860;     // position
        double veloX = 0.1, veloY = 0.1;     // velocity
        double radius = 0.05;              // radius
        // main animation loop
        animation(posicionX, posicionY, veloX, veloY, radius); 		
	}

        /**
         * <h3 align="center">Animation</h3>
         * La funcion animation se encarga de crear la secuencia de movimientos que simulan la pelota rebotando.
         * @param posicionX
         * Posicion inicial en x de la pelota.
         * @param posicionY
         * Posicion inicial en y de la pelota
         * @param veloX
         * Velocidad en x a la que se debe mover la pelota.
         * @param veloY
         * Velocidad en y a la que se debe mover la pelota.
         * @param radius
         * Radio de la pelota.
         */
	private static void animation(double posicionX, double posicionY, double veloX, double veloY, double radius) {
		while (true)  { 

            // bounce off wall according to law of elastic collision
            if (Math.abs(posicionX + veloX) > 2.0 - radius) veloX = -veloX;
            if (Math.abs(posicionY + veloY) > 2.0 - radius) veloY = -veloY;

            // update position
            posicionX = posicionX + veloX; 
            posicionY = posicionY + veloY; 

            dibujaCirculo(posicionX, posicionY, radius); 
            
            
        }
	}

	private static void dibujaCirculo(double posicionX, double posicionY, double radius) {
		// clear the background
		StdDraw.clear(StdDraw.GRAY);

		// draw ball on the screen
		StdDraw.setPenColor(StdDraw.RED); 
		StdDraw.filledCircle(posicionX, posicionY, radius); 
		
		// display and pause for 20 ms
		StdDraw.show(20);
	}

}
