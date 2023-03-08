package n2exercici1;

import java.io.*;

public class Main {

	public static void main(String args[]) {

		Serializacion(new Hotel("Vela", "Barcelona", 1564));

	}

	
	public static void Serializacion(Hotel hotel) {

	
		try {
			
			ObjectOutputStream objetosSalida = new ObjectOutputStream(new FileOutputStream(hotel.getClass().getAnnotation(Anotacio.class).archivo()));
			objetosSalida.writeObject(hotel);
			objetosSalida.close();

			System.out.println("Serializacion realizada");

		} catch (IOException e) {

			System.out.println(e);

		}

	}
}