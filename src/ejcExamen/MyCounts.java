package ejcExamen;

public class MyCounts {
	private int computer = 0;
	private int ps4 = 0;
	private int pantalla = 0;
	private int raton = 0;
	private int teclado = 0;
	private int juegoPs4 = 0;
	private int mandoPs4 = 0;

	public MyCounts() {
		super();
	}

	public int getComputer() {
		return computer;
	}

	public void setComputer() {
		this.computer++;
	}

	public int getPs4() {
		return ps4;
	}

	public void setPs4() {
		this.ps4++;
	}

	public int getPantalla() {
		return pantalla;
	}

	public void setPantalla() {
		this.pantalla++;
	}

	public int getRaton() {
		return raton;
	}

	public void setRaton() {
		this.raton++;
	}

	public int getTeclado() {
		return teclado;
	}

	public void setTeclado() {
		this.teclado++;
	}

	public int getJuegoPs4() {
		return juegoPs4;
	}

	public void setJuegoPs4() {
		this.juegoPs4++;
	}

	public int getMandoPs4() {
		return mandoPs4;
	}

	public void setMandoPs4() {
		this.mandoPs4++;
	}

	public int countFinal(String name) {
		switch (name) {
		case "computer":
			return getComputer();
		case "ps4":
			return getPs4();
		case "pantalla":
			return getPantalla();
		case "raton":
			return getRaton();
		case "teclado":
			return getTeclado();
		case "juegoPs4":
			return getJuegoPs4();
		case "mandoPs4":
			return getMandoPs4();
		}
		return 0;
	}
}
