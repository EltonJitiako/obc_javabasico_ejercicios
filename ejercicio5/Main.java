package ejercicio5;

public class Main {
    
    static CocheCRUD cocheCRUD = new CocheCRUDimpl() {
        
    };

    public static void main(String[] args) {
        
        System.out.println(cocheCRUD.save());
        System.out.println(cocheCRUD.findAll());
        System.out.println(cocheCRUD.delete());

    }

}
