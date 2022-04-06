package ejercicio_13;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {

		/* Crea una calculadora inversa, se pedirán 2 operandos y la operación.
		 * + sumar , - restar , / dividir , * multiplicar , % módulo y ^ potencia.
		 */
	
		Scanner sc = new Scanner(System.in);
		double resultado = 0;
		
		/* Bucle infinito */
		while(0 == 0) {
				
		System.out.print("Introduce primer operando: ");
		String primerDato = JOptionPane.showInputDialog("Introduce primer operando: ");
		double primerOperando = Double.parseDouble(primerDato);
		
		System.out.print("Introduce segundo operando: ");
		String segundoDato = JOptionPane.showInputDialog("Introduce primer operando: ");
		double segundoOperando = Double.parseDouble(segundoDato);
		
		
		System.out.print("\n + Sumar\n - Restar\n / Dividir\n * Multiplicar\n % Módulo\n ^ Potencia\n" +
							"\n- Selecciona operación: ");
		String operacion = JOptionPane.showInputDialog("\n + Sumar\n - Restar\n / Dividir\n * Multiplicar\n % Módulo\n ^ Potencia\n" +
							"\n- Selecciona operación: ");
		
		switch(operacion.charAt(0)) {
		case '+':
			resultado = primerOperando + segundoOperando;
			JOptionPane.showMessageDialog(null,"La suma de ambos es: " + resultado);
			break;
		case '-':
			resultado = primerOperando - segundoOperando;
			JOptionPane.showMessageDialog(null,"La resta de ambos es: " + resultado);
			break;
		case '/':
			resultado = primerOperando / segundoOperando;
			JOptionPane.showMessageDialog(null,"La división de ambos es: " + resultado);
			break;
		case '*':
			resultado = primerOperando * segundoOperando;
			JOptionPane.showMessageDialog(null,"La multiplicación de ambos es: " + resultado);
			break;
		case '%':
			resultado = primerOperando % segundoOperando;
			JOptionPane.showMessageDialog(null,"El módulo del operando1 sobre el operando2 es: " + resultado);
			break;
		case '^':
			resultado = Math.pow(primerOperando, segundoOperando);
			JOptionPane.showMessageDialog(null,"La potencia de operando1 base y operando2 exponente es: " + resultado);
			break;
			default:
				JOptionPane.showMessageDialog(null,"Operación erronea.");
		}
		
		}

	}

}
