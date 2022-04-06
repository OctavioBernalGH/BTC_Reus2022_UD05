package ejercicio_4;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		/* Haz una aplicaci�n que calcule el �rea de un circulo (pi*R*R).
		 * El radio se pedir� por teclado. Se convertir� el radio de 
		 * String a double pediante parse. Y con el m�todo pow calcularemos
		 * la potencia del radio.
		 */
		
		final double PI = 3.1415;
		
		String introduceRadio = JOptionPane.showInputDialog("Introduce radio: ");
		
		double radio = Double.parseDouble(introduceRadio);
		
		double resultado = PI * (Math.pow(radio,2));
		
		JOptionPane.showMessageDialog(null, "El area del circulo es: " + resultado);
	}

}
