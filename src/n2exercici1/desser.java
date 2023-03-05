package n2exercici1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class desser {

 public static void main(String args[])
 {
    Hotel hoteljson=null;
    try{
      //FileInputStream archivoJson = new FileInputStream("Hotel.json");
      ObjectInputStream objectJson = new ObjectInputStream(new FileInputStream("Hotel.json"));
      hoteljson = (Hotel)objectJson.readObject();
      objectJson.close();
      //fis.close();
    }
    catch(IOException e)
    {
       e.printStackTrace();
       return;
    }catch(ClassNotFoundException e)
     {
     }
    System.out.println("Nombre:"+ hoteljson.getNombre());
    System.out.println("Ciudad:"+hoteljson.getCiudad());
    System.out.println("Numero de  Habitaciones:"+hoteljson.getNumHabitaciones());
   
 }
}