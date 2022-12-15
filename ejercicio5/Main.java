package ejercicio5;

/* 
Crear una interfaz CocheCRUD.
Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
Como métodos de CocheCRUD podemos poner:
save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
*/
public class Main {
    
    static CocheCRUD cocheCRUD = new CocheCRUDimpl() {
        
    };

    public static void main(String[] args) {
        
        System.out.println(cocheCRUD.save());
        System.out.println(cocheCRUD.findAll());
        System.out.println(cocheCRUD.delete());

    }

}
