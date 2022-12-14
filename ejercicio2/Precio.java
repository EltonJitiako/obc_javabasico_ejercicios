package ejercicio2;

public class Precio {

    public static void main(String[] args) {
        
        double precio = 9.50;

        System.out.println("Precio con IVA(23%): " + setPrecio(precio));

    }

    

    static double setPrecio(double precio) {

       double iva = 23.0/100.0;
        return (iva * precio) + precio;

    }

    
}
