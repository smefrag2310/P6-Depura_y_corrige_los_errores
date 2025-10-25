package tema2_debug;

import java.util.Scanner;

/**
 * Programa con errores para practicar la depuración. El programa pide una
 * temperatura y muestra si hace frío, calor o temperatura templada. Después,
 * repite mientras el usuario quiera continuar.
 */
public class Temperaturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//SMR20252510: mostrarMensajeBienvenida() sin cerrar con ;
		mostrarMensajeBienvenida();

		boolean continuar = true;
		//SMR20252510: while sin cerrar llaves
		//SMR20252510: condición de while incorrecta, debe ser el propio continuar == true
		while (continuar==true) {
			// pedirTemperatura(sc) y monstrarResultado(temperatura) sin cerrar con ;
			double temperatura = pedirTemperatura(sc);
			mostrarResultado(temperatura);

			System.out.print("¿Desea introducir otra temperatura? (s/n): ");
			String respuesta = sc.next();
			//SMR20252510: if abrir llaves
			/*SMR20252510: Usando el anterior respuesta=="n" lo que hace es comparar referencias
			 * mientras que con equals compara el contenido, es decir, uno compara la fuente
			 * y otro compara el valor. Lo que mira con == es que sean literalente el mismo objeto.
			 */
			if (respuesta.equalsIgnoreCase("n")) {
				continuar = false;
				System.out.println("Programa finalizado.");
			}

		}
		//SMR20252510: sc.close() y sysout sin cerrar con ;
		sc.close();
		
	}

	public static void mostrarMensajeBienvenida() {
		//SMR20252510: sysout sin cerra con ;
		System.out.println("Bienvenido al analizador de temperaturas.");
		System.out.println("Este programa indica si hace frío, calor o está templado.");
	}

	public static double pedirTemperatura(Scanner sc) {
		double t;
		do {
			System.out.print("Introduce la temperatura en grados: ");
			t = sc.nextDouble();
			//SMR20252510: El condicional es incorrecto pues con && el if se hace solo si las dos se
			// cumplen
			if (t < -10 || t > 50) {
				//SMR20252510: sysout sin cerrar con ;
				System.out.println("Temperatura fuera del rango permitido (-10 a 50).");
			}
		} while (t < -10 || t > 50);
		return t;
	}

	//SMR20252510: Todos los if, else if y else sin llaves de apertura y cierre
	public static void mostrarResultado(double temperatura) {
		//SMR20252510: Todos los sysout sin cerrar con ;
		if (temperatura < 15) {
			System.out.println("Hace frío.");
		} else if (temperatura >= 15 && temperatura < 30) {
			System.out.println("Temperatura templada.");
		} else if (temperatura >= 30) {
			System.out.println("¡Hace mucho calor!");
		} else {
			System.out.println("Valor no reconocido.");
		}
	}
}
