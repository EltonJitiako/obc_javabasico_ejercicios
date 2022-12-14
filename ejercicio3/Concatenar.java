package ejercicio3;

public class Concatenar {

    public static void main(String[] args) {
        
        String[] pokemons = {"Bulbasaur", "Charizard", "Pikachu", "Venusaur"};

        String allPokes = "";

        for (String poke : pokemons) {
            allPokes = allPokes.concat(poke).concat(" ");
        }
        System.out.println(allPokes);

    }
    
}
