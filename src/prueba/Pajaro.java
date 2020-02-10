package prueba;

public class Pajaro extends Volador{

	public Pajaro(String tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void volar() {
		System.out.println("El "+ tipo + " esta despegando");
	}
	
}
