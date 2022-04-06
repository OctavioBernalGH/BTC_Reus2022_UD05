package ejercicio_11;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		/* Crea una aplicación que nos pida un día de la semana y nos diga
		 * si es laboral o no , utiliza la sentencia Switch.
		 */
		
		String diaSemana = JOptionPane.showInputDialog("Introduce día de la semana: ").toUpperCase();

		/* Utilizo el método toUpperCase para convertir las minúsculas a mayúsculas como filtro previo */		
		switch(diaSemana) {
		case "LUNES":
			JOptionPane.showMessageDialog(null, "Hoy estamos a lunes, toca trabajar.\nDía Laborable.");
			break;
		case "MARTES":
			JOptionPane.showMessageDialog(null, "Hoy estamos a martes, aún queda mucho.\nDía Laborable.");
			break;
		case "MIÉRCOLES":
			JOptionPane.showMessageDialog(null, "Hoy estamos a miercoles, ya queda menos.\nDía Laborable.");
			break;
		case "JUEVES":
			JOptionPane.showMessageDialog(null, "Ya es jueves, ya casi fin de semana.\nDía Laborable.");
			break;
		case "VIERNES":
			JOptionPane.showMessageDialog(null, "Ya es viernes, solo quedan unas horas de trabajo.\nDía Laborable.");
			break;
		case "SABADO":
			JOptionPane.showMessageDialog(null, "Ya es sabado, disfruta el día.\nDía de descanso.");
			break;
		case "DOMINGO":
			JOptionPane.showMessageDialog(null, "Ya es domingo, mañana a trabajar.\nDía de descanso.");
			break;
			default:
				JOptionPane.showMessageDialog(null, "El dia introducido no es valido.");
				break;
			
		}
		
	}

}
