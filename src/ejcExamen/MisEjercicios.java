package ejcExamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class MisEjercicios {
	private static Scanner sc = new Scanner(System.in);

	public MisEjercicios() {
	}

	/*
	 * 1- Programa que lee dos numeros A y B, y nos informa si B es divisor de A o
	 * no.
	 */

	public static void divisor(int a, int b) {
		if (a % b == 0) {
			System.out.println("B es divisor de A");
		} else {
			System.out.println("Estos numeros no son divisibles");
		}
	}

	/*
	 * 2- Programa que lee 11 n�meros comprendidos entre el 20 y 40, ambos
	 * inclusive. En el caso en el que alg�n n�mero introducido no se encontrara
	 * dentro del rango permitido, se mostrar� un mensaje de error y seguir�
	 * pidiendo n�meros. El programa finalizar� cuando se hayan introducido 11
	 * n�meros v�lidos y mostrar� el n�mero maximo introducido de los 11 v�lidos.
	 * Adem�s indicar� cu�ntos n�meros de los introducidos no han sido v�lidos.
	 */

	public static void rango() {
		int number;
		int contError = 0;
		boolean control = true;
		ArrayList<Integer> keepNumber = new ArrayList<>();
		int numberHigh = 0;

		System.out.println("Por favor introduce numeros de un rango entre 20 y 40.");

		do {
			number = sc.nextInt();
			if (number >= 20 && number <= 40) {
				keepNumber.add(number);
				if (keepNumber.size() == 11) {
					control = false;
				}
			} else {
				System.out.println("Este numero se encuentra fuera de rango. ");
				contError++;
			}

		} while (control);

		for (int i = 0; i < keepNumber.size() - 1; i++) {
			if (keepNumber.get(i) > keepNumber.get(i + 1)) {
				numberHigh = keepNumber.get(i);
				keepNumber.set(i + 1, numberHigh);
			}
		}

		System.out.println("numero de errores -> " + contError);
		System.out.println("Numero mas alto -> " + numberHigh);
	}

	/*
	 * 3- Programa que lee de manera consecutiva n�meros hasta que se introducen dos
	 * n�meros iguales seguidos.
	 */

	public static void equalNumbers() {
		boolean control = true;
		ArrayList<Integer> numbers = new ArrayList<>();

		System.out.println("Por favor introduce numeros, para salir introduce dos numeros iguales consecutivos.");

		do {

			numbers.add(sc.nextInt());
			if (numbers.size() != 0) {
				for (int i = 0; i < numbers.size() - 1; i++) {
					if (numbers.get(i) == numbers.get(i + 1)) {
						control = false;
						System.out.println("Adios....");
					}
				}
			}

		} while (control);
	}

	/*
	 * 4- Programa que muestra todos los divisores de un n�mero introducido. Entre
	 * los divisores no se incluir� el propio n�mero.
	 * 
	 * 5- Programa que nos informa si un n�mero introducido es primo o no.
	 * 
	 */

	public static void allDividers() {
		int dividers[];
		String primo = "";
		ArrayList<Integer> newDividers = new ArrayList<>();

		System.out.println("Por favor ingrese numero: ");
		int number = sc.nextInt();
		dividers = new int[number];

		for (int i = 1; i < dividers.length; i++) {
			if (number % i == 0) {
				newDividers.add(i);
			}
		}

		if (newDividers.size() == 1) {
			primo = "Es un numero primo";
		} else {
			primo = "No es un numero primo";
		}
		System.out.println("Todos los divisores de " + number + " ->" + newDividers + " -> " + primo);
	}

	/*
	 * 6. Programa que lee 9 n�meros, y en el caso en el que el primero introducido
	 * sea igual al �ltimo, nos muestra la media. En caso contrario, no se mostrar�
	 * nada.
	 */

	public static void mediaAritmetica() {
		ArrayList<Integer> media = new ArrayList<>();
		int firsNumber;
		int lastNumber;
		double suma = 0.0;
		double result = 0.0;

		System.out.println("Por favor ingrese numeros : ");

		for (int i = 0; i < 9; i++) {
			media.add(sc.nextInt());
		}

		firsNumber = media.get(0);
		lastNumber = media.get(8);

		if (firsNumber == lastNumber) {
			for (int i = 0; i < media.size(); i++) {
				suma += media.get(i);
			}

			result = suma / 9;
			System.out.println("La media de -> " + media + " = " + result);

		} else {
			System.out.println("Este array no cumple las condiciones para sacar la media");
		}
	}

	/*
	 * 7. Programa que pide el n�mero de calificaciones a introducir, y una nota de
	 * corte. A continuaci�n se introducir�n las calificaciones, para finalmente
	 * indicar cu�ntas calificaciones han igualado o superado la nota de corte.
	 */

	public static void notaMedia() {
		int nota;
		int numScore;
		int notaCut;
		int notasAlaumns[];
		String notasAll = "";
		ArrayList<String> notas = new ArrayList<>();
		System.out.println("Por favor introduce el numero de notas: ");
		numScore = sc.nextInt();
		notasAlaumns = new int[numScore];
		System.out.println("Por favor introduce la nota de corte: ");
		notaCut = sc.nextInt();
		System.out.println("A continuacion debera introducir las notas de los alumnos: ");
		for (int i = 0; i < notasAlaumns.length; i++) {
			nota = Math.round(sc.nextFloat());
			if (nota >= notaCut) {
				notasAll = Integer.toString(nota);
				notas.add(notasAll + " -> Aprobado");
			} else {
				notasAll = Integer.toString(nota);
				notas.add(notasAll + " -> Suspenso");
			}
		}

		System.out.println("Los alumnos que han superado la nota de corte son: ");
		System.out.println(notas.toString());
	}

	/*
	 * 8. Programa que lee X n�meros. Al finalizar mostrar� el m�ximo introducido, y
	 * cu�ntas veces se repite dicho m�ximo.
	 */

	public static void maxNum() {

		ArrayList<Integer> numbers = new ArrayList<>();
		int count = 0;
		int maxNum = 0;
		System.out.println("Ingrese cantidad de numeros a evaluar: ");
		int howManyNum = sc.nextInt();
		for (int i = 0; i < howManyNum; i++) {
			numbers.add((int) (Math.random() * howManyNum + 1));
		}

		for (Integer num : numbers) {
			if (num > maxNum) {
				maxNum = num;
			}
		}

		for (Integer num : numbers) {
			if (num == maxNum) {
				count++;
			}
		}

		System.out
				.println("El numero mas alto de : " + "\n" + numbers + " es-> " + maxNum + "\ny se repite -> " + count);
	}

	/*
	 * 9. Programa consistente en un juego en el que el Jugador1 introduce un n�mero
	 * entre el 1 y el 100 y el Jugador2 tendr� que adivinarlo en un m�ximo de 10
	 * intentos. Por cada intento del Jugador2, y en el caso de no acertar, se
	 * mostrar� el mensaje �Te pasaste�, o �No llegaste�, seg�n corresponda. De la
	 * misma manera, y al terminar el programa, se mostrar�n los mensajes
	 * �Acertaste� o bien �Intentos agotados�.
	 */

	public static void game() {
		int playerOne;
		int playerTwo;
		boolean win = true;

		System.out.println("playerOne -> Por favor introduce un numero del 1 al 100: ");
		playerOne = sc.nextInt();

		if (playerOne >= 1 && playerOne <= 100) {
			System.out.println("PlayerTwo -> Por favor intente adivinar el numero introducido por playerOne: ");
			for (int i = 1; i <= 10; i++) {
				playerTwo = sc.nextInt();
				if (playerTwo == playerOne) {
					System.out.println("Acertastes a los -> " + i + " intentos.");
					i = 10;
					win = false;
				} else if (playerTwo > playerOne) {
					System.out.println("Te pasaste, prueba de nuevo");

				} else if (playerTwo < playerOne) {
					System.out.println("No llegaste, prueba de nuevo");
				}
			}
			if (win) {
				System.out.println("\nFin del juego, se te acabaron los intentos");
			}
		} else {
			System.out.println("playerOne -> Numero fuera de rango.");
		}
	}

	/*
	 * 10. Programa que lee 10 n�meros e indica si todos los n�meros son iguales o
	 * no.
	 */

	public static void numEquals() {
		int num[] = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
		int take = 0;
		boolean value = true;

		for (int i = 0; i < num.length - 1; i++) {
			take = num[i];
			if (take == num[i + 1]) {
				take = num[i + 1];
			} else {
				System.out.println("Los numeros del array no son iguales. ");
				value = false;
				break;
			}
		}

		if (value) {
			System.out.println("Todos los numeros del array son iguales. ");
		}

	}

	/*
	 * 11. Programa que lee nombre y a�o de nacimiento de una serie de alumnos hasta
	 * introducir como nombre de alumno �fin�. En ese momento mostrar� la edad media
	 * de los alumnos y el nombre del alumno menor. NOTA: Al introducir como nombre
	 * �fin�, no nos ha de pedir el a�o de nacimiento.
	 */

	public static void createAlumno() {
		ArrayList<Alumno> alumnos = new ArrayList<>();
		ArrayList<Integer> años = new ArrayList<>();
		String nombre = "";
		int año = 0;
		boolean keep = true;
		int mediaAños = 0;
		int menorAlumn = 0;

		System.out.println(
				"Introduce nombre y a�o del alumno, para finalizar la creacion de alumnos,puedes escribir 'fin' como nombre");
		while (keep) {
			System.out.println("Crea Alumno : ");
			nombre = sc.nextLine();
			if (!nombre.equals("fin")) {
				año = Integer.parseInt(sc.nextLine());
				alumnos.add(new Alumno(nombre, año));
			} else {
				keep = false;
				for (Alumno i : alumnos) {
					mediaAños += i.año;
					años.add(i.año);
				}

				mediaAños = mediaAños / años.size();
				mediaAños = 2020 - mediaAños;
				Collections.sort(años);
				Collections.reverse(años);
				menorAlumn = años.get(0);
				for (Alumno i : alumnos) {
					if (i.año == menorAlumn) {
						System.out.println(
								"El alumno mas joven es -> " + i.nombre + " y la media de edad es -> " + mediaAños);
					}
				}
			}
		}
	}

	/*
	 * 12. Programa que muestra los n�meros primos existentes entre el 1 y el 100.
	 * NOTA: Un n�mero es primo si tiene dos �nicos divisores que son el 1 y �l
	 * mismo.
	 */

	public static void primos() {
		int allPrimos = 100;
		int count = 0;

		for (int i = 2; i <= allPrimos; i++) {
			for (int x = 1; x <= i && count < 3; x++) {
				if (i % x == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
			count = 0;
		}
	}

	/*
	 * 13. Programa que lee una secuencia de 10 n�meros y muestra el mayor de los
	 * m�ltiplos de 5, y el menor de los m�ltiplos de 3. Si no hubiera ning�n
	 * m�ltiplo, el programa lo indicar�a.
	 */

	public static void biggerAndSmaller() {
		ArrayList<Integer> byThree = new ArrayList<>();
		ArrayList<Integer> byFive = new ArrayList<>();
		int myNum;
		String msj = "";
		String msj2 = "";

		for (int i = 0; i < 6; i++) {
			System.out.println("Por favor introduce un numero: ");
			myNum = sc.nextInt();
			if (myNum % 3 == 0) {
				byThree.add(myNum);
				if (myNum % 5 == 0) {
					byFive.add(myNum);
				}
			} else {
				if (myNum % 5 == 0) {
					byFive.add(myNum);
				}
			}
		}

		if (byThree.size() == 0) {
			msj += "No hay multiplos de 3";
			byThree.add(0);
		}

		if (byFive.size() == 0) {
			msj2 += "No hay multiplos de 5";
			byFive.add(0);
		}

		Collections.sort(byThree);
		Collections.sort(byFive);
		Collections.reverse(byFive);
		System.out.println("El multiplo de 3 mas bajo es -> " + ((byThree.size() == 0) ? msj : byThree.get(0))
				+ " y el Multiplo de 5 mas alto es -> " + byFive.get(0) + " " + msj2);
	}

	/*
	 * 15. Programa que lee un n�mero y muestra la suma de sus divisores, sin
	 * incluir el propio n�mero entre sus divisores.
	 */

	public static void sumaDiv() {
		int iterator = 2;
		ArrayList<Integer> divisoresOrder;
		HashSet<Integer> divisores = new HashSet<>();
		int numDiv;
		int divNum;
		int sumDiv = 0;
		;

		System.out.println("Ingrese numero: ");
		numDiv = sc.nextInt();
		divNum = numDiv;
		divisores.add(1);

		while (iterator < divNum) {
			if (numDiv % iterator == 0) {
				divisores.add(iterator);
				divNum = numDiv / iterator;
				divisores.add(divNum);
			}
			iterator++;
		}

		divisoresOrder = new ArrayList<>(divisores);
		Collections.sort(divisoresOrder);

		for (Integer i : divisoresOrder) {
			sumDiv += i;
			System.out.println(i);
		}
		System.out.println("\nsuma: ");
		System.out.println(sumDiv);
	}

	/*
	 * 16. Programa que genera los N primeros n�meros de la serie de Fibonacci. El
	 * valor N deber� ser le�do por el teclado. NOTA: Los dos primeros n�meros son
	 * 1, y el resto se obtiene sumando los dos anteriores: 1,1,2,3,5,8,13,21�
	 */

	public static void fibonacci() {

		ArrayList<Integer> secuenFibonacci = new ArrayList<>();
		int numFibonacci;
		int sumFibo = 0;
		int first = 0;
		int second = 1;
		System.out.println("Ingrese numero: ");
		numFibonacci = sc.nextInt();
		secuenFibonacci.add(0);
		secuenFibonacci.add(1);

		for (int i = 0; i <= numFibonacci; i++) {
			sumFibo = first + second;
			secuenFibonacci.add(sumFibo);
			first = second;
			second = sumFibo;
		}

		for (Integer i : secuenFibonacci) {
			System.out.println(i);
		}
	}

	/*
	 * 17. Programa que lee cantidades y precios de productos, para al final indicar
	 * el total de la factura. Si el importe supera los 1000� se aplicar� un
	 * descuento del 5%. El programa finaliza al introducir una cantidad 0.
	 */

	public static void tiendaOnline() {
		Mytienda m = new Mytienda();
		m.misProductos();
		System.out.println("Su pedido:\n ");
		m.mostrarCesta();
	}

}

class Alumno {
	String nombre;
	int año;

	public Alumno(String nombre, int año) {
		this.nombre = nombre;
		this.año = año;
	}

}
