package n1exercici1;

public class TrabajadorPresencial extends Trabajador {

	private static int gasolina;

	public TrabajadorPresencial(String nombre, String apellido, int precioHora, int gasolina) {
		super(nombre, apellido, precioHora);
		TrabajadorPresencial.gasolina = gasolina;
		;
	}

	@Override

	public int calcularSou(int numHoras) {

		return (numHoras * precioHora) + gasolina;

	}

}
