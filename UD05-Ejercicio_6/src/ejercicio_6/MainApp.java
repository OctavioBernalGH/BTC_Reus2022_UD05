package ejercicio_6;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		/* Lee un número por teclado que pida el precio de un producto y calcule
		 * el precio final con iva. IVA será constante 21%.
		 */
		
		final double IVA = 1.21;
		
		double precioProducto = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto: "));
		double precioFinal = precioProducto * IVA;
		
		JOptionPane.showMessageDialog(null, "El precio final del producto con IVA es: " + precioFinal );

	}

}
