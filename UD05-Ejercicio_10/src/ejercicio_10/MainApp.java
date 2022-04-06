package ejercicio_10;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		/* Realiza una aplicación que nos pida un número de ventas a introducir,
		 * después nos pedirá el precio de cada una y al final nos mostrará el
		 * computo total.
		 */
		
		int numeroVentas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de artículos: "));
		int precioTotal = 0;
		
		for (int i=1; numeroVentas >= i; i++) {
			
			/* Mediante parseInt convertimos de String a Integer , con el bucle for recorremos
			 * n veces la demanda de precio y mostramos por pantalla el valor de cada producto
			 * y el valor total.
			 */
			
			int precio = Integer.parseInt(JOptionPane.showInputDialog("Introduce precio del artículo :" + i));
			precioTotal += precio;
			
			if (i >= numeroVentas) {
			JOptionPane.showMessageDialog(null, "El importe total asciende a: " + precioTotal + " Euros.");
			}
		}
		
	}

}
