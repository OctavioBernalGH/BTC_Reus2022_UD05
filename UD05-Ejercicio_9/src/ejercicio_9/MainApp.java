package ejercicio_9;

public class MainApp {

	public static void main(String[] args) {

		/* Muestra los números del 1 al 100 ambos incluidos divisibles
		 * entre 2 y 3. Utiliza el bucle que desees.
		 */
		
		for(int i=1; i<101; i++)
		{
			if (i % 2 == 0) {
				System.out.println(i + " divisible entre 2");
			} else if (i % 3 == 0) {
				System.out.println(i + "divisible entre 3");
			}
		}
		
	}

}
