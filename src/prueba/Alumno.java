package prueba;

public class Alumno implements Comparable<Alumno>{
	private int matricula;
	private String nombre;
	private String apellido1;
	private String apellido2;

	public Alumno(int matricula, String nombre, String apellido1, String apellido2) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + "]";
	}

	@Override
	public int compareTo(Alumno alumnoCompare) {
		int respuesta;	
		respuesta = this.matricula - alumnoCompare.matricula;
		return respuesta;
	}
	
	

}
