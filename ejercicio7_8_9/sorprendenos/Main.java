package ejercicio7_8_9.sorprendenos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 */

/********** Programa **********/
/* Recibe una lista de nombres de un archivo y la coloca en una array, verifica el apellido de cada nombre en un HashMap, al final actualiza el archivo. */

public class Main {

    public static void main(String[] args) {
        
        String file = "./ejercicio7_8_9/sorprendenos/file.txt";

        try {

            fileInOut(file);

        }catch(Exception e) {

            System.out.println("Exception IO or File Nor Found: " + e.getMessage());

        }

    }

    private static void fileInOut(String file) throws IOException {

        try {

            InputStream in = new FileInputStream(file);
            byte[] datos = in.readAllBytes();
            in.close();

            ArrayList<String> nombresList = pasaArray(datos);
            
            nombresList = pasaApNombres(nombresList);

            byte[] novoDatos = pasaByte(nombresList);

            PrintStream out = new PrintStream(file);
            out.write(novoDatos);
            out.close();

        } catch (Exception e) {
        
            throw new IOException();

        }

    }

    private static byte[] pasaByte(ArrayList<String> nombresList) {

        String listString = "";
        for (String nombre : nombresList) {
            listString += nombre + ", ";
        }
        System.out.println(listString);
        byte[] novoDatos = listString.getBytes(StandardCharsets.UTF_8);
        return (novoDatos);
    }

    private static ArrayList<String> pasaApNombres(ArrayList<String> nombresList) {

        HashMap<String, String> apNombres = new HashMap<>();

        apNombres.put("Maria", "Gonzalez");
        apNombres.put("Lucas", "Valle");
        apNombres.put("Mateus", "Gimenez");
        apNombres.put("Icaro", "Perez");
        apNombres.put("Luciane", "Luz");
        apNombres.put("Ariane", "Farina");
        apNombres.put("Cintia", "Gasp");
        apNombres.put("Jonas", "Herrera");

        for (int i=nombresList.size()-1; i >= 0 ; i--) {

            String nombreCompleto = nombresList.get(i) + ' ' + apNombres.get(nombresList.get(i));
            nombresList.remove(i);
            nombresList.add(nombreCompleto);

        }

        return nombresList;

    }

    private static ArrayList<String> pasaArray(byte[] datos) {

        ArrayList<String> nombresList = new ArrayList<>();
        String nombresString = new String(datos, StandardCharsets.UTF_8);
        String nombre = "";
        for (char i : nombresString.toCharArray()) {

            if(i != ',' && i != ' ') {

                nombre = nombre + i;

            }else if(i == ' ') {

                continue;

            }else if(i == ',') {

                nombresList.add(nombre);
                nombre="";

            }

        }

        return nombresList;

    }
    
}
