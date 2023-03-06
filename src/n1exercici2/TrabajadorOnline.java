package n1exercici2;

public class TrabajadorOnline extends Trabajador {

	private final int internet = 40;

	public TrabajadorOnline(String nombre, String apellido, int precioHora) {
		super(nombre, apellido, precioHora);

	}

	@Override

	public int calcularSou(int numHoras) {

		return (numHoras * precioHora) + internet;

	}

	@Deprecated
	public void printTarifa() {
		System.out.println(internet);
	}

}
