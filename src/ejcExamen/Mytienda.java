package ejcExamen;

import java.util.HashMap;
import java.util.Scanner;

public class Mytienda {
	private Double computer = 750.00;
	private Double ps4 = 399.00;
	private Double pantalla = 149.00;
	private Double raton = 25.00;
	private Double teclado = 70.00;
	private Double juegoPs4 = 59.00;
	private Double mandoPs4 = 69.00;
	private HashMap<String, Double> tuCesta = new HashMap<>();
	private static Scanner sc = new Scanner(System.in);
	private MyCounts m = new MyCounts();

	public Mytienda() {
	}

	public void misProductos() {

		int option = 0;
		boolean salir = true;
		System.out.println("Indique seleccionado el numero lo que quieres y cualquier otro numero para salir: \n");
		System.out.println("1-ordenador -> " + computer + " Euros.\n" + "2-ps4 -> " + ps4 + "Euros.\n"
				+ "3-pantalla -> " + pantalla + " Euros.\n" + "4-raton -> " + raton + " Euros.\n" + "5-teclado -> "
				+ teclado + " Euros.\n" + "6-juegoPs4 -> " + juegoPs4 + " Euros.\n" + "7-mandoPs4 -> " + mandoPs4
				+ " Euros.\n");

		do {
			option = sc.nextInt();
			switch (option) {
			case 1:
				tuCesta.put("computer", computer);
				m.setComputer();
				break;
			case 2:
				tuCesta.put("ps4", ps4);
				m.setPs4();
				break;
			case 3:
				tuCesta.put("pantalla", pantalla);
				m.setPantalla();
				break;
			case 4:
				tuCesta.put("raton", raton);
				m.setRaton();
				break;
			case 5:
				tuCesta.put("teclado", teclado);
				m.setTeclado();
				break;
			case 6:
				tuCesta.put("juegoPs4", juegoPs4);
				m.setJuegoPs4();
				break;
			case 7:
				tuCesta.put("mandoPs4", mandoPs4);
				m.setMandoPs4();
				break;
			default:
				salir = false;
			}

		} while (salir);

		calculoPedido(tuCesta);
	}

	private void calculoPedido(HashMap<String, Double> myCesta) {
		Double sumPedido = 0.0;
		Double porciento = 0.0;

		for (String i : tuCesta.keySet()) {
			sumPedido += tuCesta.get(i) * m.countFinal(i);
		}

		if (sumPedido >= 1000) {
			System.out.println("Tu pedido es superior a 1000 euros 'Enhorabuena!!!!' tienes un 5% de descuento");
			porciento = sumPedido * 0.05;
			sumPedido = sumPedido - porciento;
		}

		System.out.println("El total de su compra es de : " + sumPedido + " Euros\n");
	}

	public void mostrarCesta() {

		int count = 0;
		if (tuCesta.size() == 0) {
			System.out.println("Su cesta esta vacia.... sorry");
		} else {
			for (String i : tuCesta.keySet()) {
				count = m.countFinal(i);
				System.out.println(count + " -> " + i + " -> " + tuCesta.get(i) + " x " + count + " = "
						+ tuCesta.get(i) * count + " Euros");
			}
		}
	}
}

