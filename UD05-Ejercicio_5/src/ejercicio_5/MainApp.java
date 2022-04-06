package ejercicio_5;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		/* Lee un número por teclado e indica si es divisible entre 2.
		 * Si no lo es, también se indicará.
		 */
		
		System.out.println("Introduce un número: ");
		
		int numeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero: "));
		
		int esDivisible = numeroIntroducido % 2;
		
		if (esDivisible == 0) {
			JOptionPane.showMessageDialog(null, "El número: " + numeroIntroducido + " es divisible por 2");
		} else {
			JOptionPane.showMessageDialog(null, "El número: " + numeroIntroducido + " no es divisible por 2");
		}
		
	}

}
