package ejercicio7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/* 
Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Cadena ao reves
        System.out.println(reverse("hola mundo"));

        //Array unidimensional
        String []array1 = {"q1", "w2", "e3", "r4"};

        for (int i=0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        //Array bidimensional
        int [][]array2 = new int[3][3];
        array2[0][0] = 23;
        array2[0][1] = 30;
        array2[0][2] = 49;

        array2[1][0] = 907;
        array2[1][1] = 4;
        array2[1][2] = 51;

        array2[2][0] = 83;
        array2[2][1] = 82;
        array2[2][2] = 10;

        for (int i=0; i < array2.length; i++) {

            for (int j=0; j < array2[i].length; j++) {

                System.out.println("Posicion[" + i + "][" + j + "] con valor:" + array2[i][j]);

            }
        }

        //Vector
        Vector<String> vector1 = new Vector<>();

        vector1.add("Coca-Cola");
        vector1.add("Pepsi");
        vector1.add("Fanta");
        vector1.add("Soda");
        vector1.add("Sprite");

        vector1.remove(1); //remove 2º elemento
        vector1.remove(1); //remove 3º elemento

        for (int i=0; i < vector1.size(); i++) {

            System.out.println(vector1.get(i));

        }

        /* El problema de usar vector es que con cada elemento agregado se crea una nueva array más grande para adaptarse al nuevo tamaño y esto consume mucha CPU. */

        //ArrayList y LinkedList
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("za");
        lista1.add("xs");
        lista1.add("cd");
        lista1.add("vf");

        LinkedList<String> lista2 = new LinkedList<>(lista1);

        for (String e : lista1) {
            System.out.println("Valor de ArrayList: " + e);
        }

        for (String e : lista2) {
            System.out.println("Valor de LinkedList:  " + e);
        }

        //ArrayList remove pares
        ArrayList<Integer> lista3 = new ArrayList<>();

        for (int i=1; i <=10; i++) {
            lista3.add(i);
        }

        for (int i=lista3.size()-1; i >= 0; i--) {
            if(lista3.get(i)%2==0){
                lista3.remove(i);
                continue;
            }
            System.out.println(lista3.get(i));
        }

        //Throws
        DividePorCero();

        //InputStream y PrintStream


        //Sorpréndenos
        //El codigo esta en la carpeta 'ejercicio7_8_9/sorprendenos'

    }

    public static String reverse(String texto) { 

        String textoRev = "";
        for (char i : texto.toCharArray()) {

            textoRev = i + textoRev;

        }
       
        return textoRev;

    }

    public static void DividePorCero() throws ArithmeticException { 

        int a = 3;
        int b = 0;


        try {

            int result = a / b;
            System.out.println("Resultado: " + result);

        }catch(ArithmeticException e) {

            System.out.println("Esto no puede hacerse");

        }finally {

          System.out.println("Demo de código");

        }

    }

}
