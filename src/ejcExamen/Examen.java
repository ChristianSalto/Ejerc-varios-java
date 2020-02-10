package ejcExamen;

import java.util.Scanner;

public class Examen {
	private static Scanner sc = new Scanner(System.in);
	private boolean cafetera = false;
	private int cafeLitros = 0;
	private int vasoCafe = 100;
	private int tazaCafe = 50;

	public Examen() {
		super();
		menuCafetera();
	}

	public void menuCafetera() {
		int option = 0;
		System.out.println("\n1- Llenar cafetera\n" + "2- Servir taza\n" + "3- Servir vaso\n" + "4- Vaciar cafetera\n"
				+ "5- Mostrar contenido de la cafetera\n" + "6- Salir");

		option = sc.nextInt();
		switch (option) {
		case 1:
			llenarCafetera(option);
			break;
		case 2:
			servirCafe(option);
			break;
		case 3:
			servirCafe(option);
			break;
		case 4:
			llenarCafetera(option);
			break;
		case 5:
			mostrarCafe();
			break;
		case 6:
			break;
		default:
			System.out.println("La opcion es incorrecta");
		}
	}

	private void llenarCafetera(int valor) {
		if (valor == 1) {
			cafetera = true;
			cafeLitros = 1000;
			menuCafetera();
		} else if (valor == 4) {
			cafetera = false;
			cafeLitros = 0;
			menuCafetera();
		}
	}

	private void mostrarCafe() {
		if (cafetera) {
			System.out.println("La cafetera tiene " + cafeLitros + " Mililitros");
			menuCafetera();
		} else {
			System.out.println("La cafetera esta vacia");
			menuCafetera();
		}
	}

	private void servirCafe(int value) {
		String type;
		if (value == 2) {
			type = "vaso";
		} else {
			type = "taza";
		}
		if (cafeLitros > 0) {
			if (type.equals("vaso") && cafeLitros >= 100) {
				cafeLitros = cafeLitros - vasoCafe;
				System.out.println("Gracias se acaba de tomar un " + type + " de cafe.... ");
				menuCafetera();
			} else if (type.equals("taza")) {
				cafeLitros = cafeLitros - tazaCafe;
				System.out.println("Gracias se acaba de tomar una " + type + " de cafe.... ");
				menuCafetera();
			} else {
				System.out.println("No hay suficiente cafe para llenar un vaso, pruebe con una taza");
				menuCafetera();
			}
		} else {
			System.out.println("La cafetera esta vacia por favor llenela gracias.");
			menuCafetera();
		}

	}
}

/*-  Nombra los miembros de una clase ->  Atributos, Metodos y Metodos constructores
 *- �Cuales son las caracteristicas de la POO? -> --- Abstracion : Es la manera que tenemos de representar los objetos, nos abstremos y los representamos como la realidad
 *                                                    Encapsulamiento : Nos permite ocultar y controlar la complejidad del codigo 
 *                                                    Polimorfismo : Es la capaciadad que tiene un objeto o metodo de adoptar diferentes formas o tipos sin cambiar su nombre
 *                                                    Herencia : Nos permite reutilizar codigo ya que la clase que hereda podra acceder a los atributos o metodos de las clases superiores (clase padre)
 *                                                    
 *- �Cuantos constructores puede tener una clase? ->  Tantos como necesites siempre y cuando no esten repetidos, ya que podemos tener sobrecarga de constructores
 *- �Sabrias decir cuales son los modificadores de acceso? ->  Public, protected y privado.
 *
 **/
