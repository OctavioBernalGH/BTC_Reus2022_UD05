package ejercicio_5;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		/* Lee un n�mero por teclado e indica si es divisible entre 2.
		 * Si no lo es, tambi�n se indicar�.
		 */
		
		System.out.println("Introduce un n�mero: ");
		
		int numeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero entero: "));
		
		int esDivisible = numeroIntroducido % 2;
		
		if (esDivisible == 0) {
			JOptionPane.showMessageDialog(null, "El n�mero: " + numeroIntroducido + " es divisible por 2");
		} else {
			JOptionPane.showMessageDialog(null, "El n�mero: " + numeroIntroducido + " no es divisible por 2");
		}
		
	}

}
