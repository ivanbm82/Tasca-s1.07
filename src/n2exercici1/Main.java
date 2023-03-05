package n2exercici1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import n2exercici1.Anotacio.Serializacion;

//import n2exercici1.Anotacio.Serializacion;

import java.io.IOException;

public class Main {

	public static void main(String args[]) {

		SerializacionObjeto(new Hotel("Vela", "Barcelona", 1564));

	}

	@Serializacion()

	public static void SerializacionObjeto(Hotel hotel) {

		try {

			// FileOutputStream fos = new FileOutputStream("Hotel.json");
			ObjectOutputStream objetosSalida = new ObjectOutputStream(new FileOutputStream("Hotel.json"));
			objetosSalida.writeObject(hotel);
			objetosSalida.close();
			// fos.close();

			System.out.println("Serializacion realizada");

		} catch (IOException e) {

			System.out.println(e);

		}

	}
}