package ejercicio_11;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		/* Crea una aplicaci�n que nos pida un d�a de la semana y nos diga
		 * si es laboral o no , utiliza la sentencia Switch.
		 */
		
		String diaSemana = JOptionPane.showInputDialog("Introduce d�a de la semana: ").toUpperCase();

		/* Utilizo el m�todo toUpperCase para convertir las min�sculas a may�sculas como filtro previo */		
		switch(diaSemana) {
		case "LUNES":
			JOptionPane.showMessageDialog(null, "Hoy estamos a lunes, toca trabajar.\nD�a Laborable.");
			break;
		case "MARTES":
			JOptionPane.showMessageDialog(null, "Hoy estamos a martes, a�n queda mucho.\nD�a Laborable.");
			break;
		case "MI�RCOLES":
			JOptionPane.showMessageDialog(null, "Hoy estamos a miercoles, ya queda menos.\nD�a Laborable.");
			break;
		case "JUEVES":
			JOptionPane.showMessageDialog(null, "Ya es jueves, ya casi fin de semana.\nD�a Laborable.");
			break;
		case "VIERNES":
			JOptionPane.showMessageDialog(null, "Ya es viernes, solo quedan unas horas de trabajo.\nD�a Laborable.");
			break;
		case "SABADO":
			JOptionPane.showMessageDialog(null, "Ya es sabado, disfruta el d�a.\nD�a de descanso.");
			break;
		case "DOMINGO":
			JOptionPane.showMessageDialog(null, "Ya es domingo, ma�ana a trabajar.\nD�a de descanso.");
			break;
			default:
				JOptionPane.showMessageDialog(null, "El dia introducido no es valido.");
				break;
			
		}
		
	}

}
