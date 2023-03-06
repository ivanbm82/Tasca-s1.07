package n1exercici1;

public class TrabajadorOnline extends Trabajador {

	private final int internet = 40;

	public TrabajadorOnline(String nombre, String apellido, int precioHora) {
		super(nombre, apellido, precioHora);

	}

	public int getInternet() {
		return internet;
	}

	@Override

	public int calcularSou(int numHoras) {

		return (numHoras * precioHora) + internet;

	}

}
