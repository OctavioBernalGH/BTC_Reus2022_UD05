package ejercicio_1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		/* Declara 2 variables num�ricas he indica cual es mayor de los dos.
		 * Si son iguales hay que indicarlo tambi�n.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Introduce un n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Introduce otro n�mero: ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("El " + num1 + " es m�s grande que " + num2);
		} else if (num1 < num2) {
			System.out.println("El " + num1 + " es m�s peque�o que " + num2);
		} else if (num1 == num2) {
			System.out.println("El " + num1 + " es igual que " + num2);
		} else {
			System.out.println("No es nada");
		}

	}

}
