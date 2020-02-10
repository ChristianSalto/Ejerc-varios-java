package prueba;

public abstract class Volador {
	public String tipo;

	public Volador(String tipo) {
		this.tipo = tipo;
	}

	public abstract void volar();

	public void mostrar() {
		System.out.println(this.tipo);
	}
}
