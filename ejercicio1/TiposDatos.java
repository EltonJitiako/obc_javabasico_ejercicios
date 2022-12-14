package ejercicio1;

/** 
 ----- Ejercicio 1 ------
* Crea un proyecto de Java desde 0
* Dentro del proyecto tenéis que crear un paquete. 
* En el paquete tendréis que crear una clase.Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones. */
public class TiposDatos {

    public static void main(String[] args){

        //Enteros
        byte var1 = 9;
        short var2 = 23;
        int var3 = 300;
        long var4 = 1000000;

        //Decimales
        float var5 = 2.4f;
        double var6 = 2.43d;

        //Booleano
        boolean var7 = true;
        boolean var8 = false;

        //Texto
        char var9 = 'x';
        String var10 = "Un texto de ejemplo...."; 

        System.out.println("Tipo byte: " + var1 
                            + "\nTipo short: " + var2 
                            + "\nTipo int: " + var3
                            + "\nTipo long: " + var4
                            + "\nTipo float: " + var5
                            + "\nTipo double: " + var6
                            + "\nTipo boolean 'true': " + var7
                            + "\nTipo boolean 'false': " + var8
                            + "\nTipo char: " + var9
                            + "\nTipo Strin: " + var10);

    }


}