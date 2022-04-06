package ejercicio_12;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		/* Crea una aplicación que contenga una contraseña cualquiera.
		 * Despues se te pedirá que introduzcas la contraseña, son 3
		 * intentos. Cuando aciertes ya no pedirá mas la contraseña y se
		 * mostrará un mensaje diciendo enhorabuena. Piensa en la condición
		 * de salida, 3 intentos y si acierta sale aún que le queden intentos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String pass = "1234romario";
		int i = 1;
		
		do {
			System.out.print("Introduce una contraseña: ");
			String contra = sc.nextLine();
			i++;
			
			if(contra.equals(pass)) {
				System.out.println("Contraseña correcta, puede pasar.");
				i = 4;
			}
			
		} while(i <=3);

	}

}
