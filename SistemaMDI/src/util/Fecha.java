package util;

import java.util.Calendar;
import java.util.StringTokenizer;

public class Fecha {

	public Fecha() {

	}

	public static String fechaActual() {

		Calendar c1 = Calendar.getInstance();
		String dia, annio, fechaActual;
		int mesDesde0;
		dia = Integer.toString(c1.get(Calendar.DATE));

		mesDesde0 = c1.get(Calendar.MONTH);
		mesDesde0 += 1;

		annio = Integer.toString(c1.get(Calendar.YEAR));
		fechaActual = dia + "/" + mesDesde0 + "/" + annio;

		return fechaActual;

	}

	public static String diasAumentadoFecha(int diasAumento) {

		Calendar c1 = Calendar.getInstance();
		String annio, fechaActual;
		int mesDesde0, dia;

		dia = (c1.get(Calendar.DATE));
		dia += diasAumento;

		mesDesde0 = c1.get(Calendar.MONTH);
		mesDesde0 += 1;

		annio = Integer.toString(c1.get(Calendar.YEAR));
		fechaActual = dia + "/" + mesDesde0 + "/" + annio;

		return fechaActual;
	}

	/*
	 * public static int getDia(String fecha) {
	 * 
	 * StringTokenizer st = new StringTokenizer(fecha, "/"); return
	 * Integer.parseInt(st.nextToken()); }
	 */

	/*
	 * public static int getMes(String fecha) { StringTokenizer st = new
	 * StringTokenizer(fecha, "/"); return Integer.parseInt(st.nextToken());
	 * 
	 * 
	 * }
	 */

	/*
	 * public static int getAño(String fecha) {
	 * 
	 * }
	 */

	public static int getParteFecha(String fecha, int parte) {

		StringTokenizer st = new StringTokenizer(fecha, "/");

		int parteFecha = 0;
		for (int i = 0; i < 3; i++) {

			parteFecha = Integer.parseInt(st.nextToken());
			if (parte == 0 && i == 0) {
				return parteFecha;
			}

			if (parte == 1 && i == 1) {
				return parteFecha;
			}
			
			if (parte == 2 && i == 2) {
				return parteFecha;
			}
		}
		return parteFecha;
	}

}
