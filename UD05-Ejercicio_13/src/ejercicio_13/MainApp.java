package ejercicio_13;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {

		/* Crea una calculadora inversa, se pedir�n 2 operandos y la operaci�n.
		 * + sumar , - restar , / dividir , * multiplicar , % m�dulo y ^ potencia.
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
		
		
		System.out.print("\n + Sumar\n - Restar\n / Dividir\n * Multiplicar\n % M�dulo\n ^ Potencia\n" +
							"\n- Selecciona operaci�n: ");
		String operacion = JOptionPane.showInputDialog("\n + Sumar\n - Restar\n / Dividir\n * Multiplicar\n % M�dulo\n ^ Potencia\n" +
							"\n- Selecciona operaci�n: ");
		
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
			JOptionPane.showMessageDialog(null,"La divisi�n de ambos es: " + resultado);
			break;
		case '*':
			resultado = primerOperando * segundoOperando;
			JOptionPane.showMessageDialog(null,"La multiplicaci�n de ambos es: " + resultado);
			break;
		case '%':
			resultado = primerOperando % segundoOperando;
			JOptionPane.showMessageDialog(null,"El m�dulo del operando1 sobre el operando2 es: " + resultado);
			break;
		case '^':
			resultado = Math.pow(primerOperando, segundoOperando);
			JOptionPane.showMessageDialog(null,"La potencia de operando1 base y operando2 exponente es: " + resultado);
			break;
			default:
				JOptionPane.showMessageDialog(null,"Operaci�n erronea.");
		}
		
		}

	}

}
