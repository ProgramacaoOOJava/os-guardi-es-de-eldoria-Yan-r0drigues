import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guerreiro arthus = new Guerreiro("Arthur", 8, 56, 25.3, 34, 23);
        Mago morgana = new Mago("Morgana", 10, 32, 28.6, 34, 18);
        
        arthus.exibirStatus();
        arthus.usarHabilidadeEspecial();
        morgana.exibirStatus();
        morgana.usarHabilidadeEspecial();
        
        System.out.println("\n----- Array de Personagens -----\n");
        List<Personagem> herois = new ArrayList<>();
        
        herois.add(arthus);
        herois.add(morgana);
        
        herois.add(new Guerreiro("Borin", 25, 89, 45.0, 68, 99.2));
        herois.add(new Mago("Elana", 3, 12, 15.1, 8, 7));
        
        for (Personagem p : herois) {
        	p.exibirStatus();
        	p.usarHabilidadeEspecial();
        }
    }
}
