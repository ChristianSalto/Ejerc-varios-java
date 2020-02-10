package prueba;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		
		Pajaro pajaro = new Pajaro("Loro");
		pajaro.mostrar();
		pajaro.volar();
		
		
		Avion avion = new Avion("caza");
		avion.mostrar();
		avion.volar();
/*
		Alumno alumnos[] = new Alumno[4];
		Alumno a1;
		Alumno a2;
		Alumno a3;
		Alumno a4;

		a1 = new Alumno(104, "sergio", "cabrera", "alonso");
		a2 = new Alumno(20, "pepe", "lenzo", "rio");
		a3 = new Alumno(32, "julio", "siro", "roncero");
		a4 = new Alumno(48, "marco", "raton", "rivero");

		alumnos[0] = a1;
		alumnos[1] = a2;
		alumnos[2] = a3;
		alumnos[3] = a4;

		Arrays.sort(alumnos);
	
		for (Alumno i : alumnos) {
			System.out.println(i);
		}
		
		
		System.out.println(alumnos[1].toString());
		
		*/
	}

}
