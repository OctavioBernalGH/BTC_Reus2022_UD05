package ejercicio_12;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		/* Crea una aplicaci�n que contenga una contrase�a cualquiera.
		 * Despues se te pedir� que introduzcas la contrase�a, son 3
		 * intentos. Cuando aciertes ya no pedir� mas la contrase�a y se
		 * mostrar� un mensaje diciendo enhorabuena. Piensa en la condici�n
		 * de salida, 3 intentos y si acierta sale a�n que le queden intentos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String pass = "1234romario";
		int i = 1;
		
		do {
			System.out.print("Introduce una contrase�a: ");
			String contra = sc.nextLine();
			i++;
			
			if(contra.equals(pass)) {
				System.out.println("Contrase�a correcta, puede pasar.");
				i = 4;
			}
			
		} while(i <=3);

	}

}
