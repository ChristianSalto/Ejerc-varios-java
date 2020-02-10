package prueba;

public class Avion extends Volador{

	public Avion(String tipo) {
		super(tipo);
	}

	@Override
	public void volar() {
		System.out.println("El " + tipo + " esta despegando");		
	}
	
}
