package n1exercici1;

public class Trabajador {
	
	protected String nombre;
	protected String apellido;
	protected int precioHora;
	
	public Trabajador(String nombre, String apellido, int precioHora) {
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.precioHora=precioHora;
	}
		
		
	public int getPrecioHora() {
		return precioHora;
	}
	
	public int calcularSou(int numHoras) {
	
		return numHoras*precioHora;
		
	}
}
