package ejercicio_3;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		/* Modifica la aplicación anterior para que nos pida el nombre
		 * que queremos introducir mediante JOptionPane.
		 */
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
		
	}

}
