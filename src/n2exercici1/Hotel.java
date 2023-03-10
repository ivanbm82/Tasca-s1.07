package n2exercici1;

import java.io.Serializable;


@Anotacio


public class Hotel implements Serializable {


	private static final long serialVersionUID = 1L;
	private String nombre;
	private String ciudad;
	private int numHabitaciones;

	public Hotel(String nombre, String ciudad, int numHabitaciones) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.numHabitaciones = numHabitaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

}