public class Main {
    public static void main(String[] args) {
    	//Criando personagens
    	Guerreiro sindri = new Guerreiro("Sindri", 5, 150, 12.0, 8, 55.0);
    	Mago hildr = new Mago("Hildr", 7, 100, 15.0, 19, 11);
    	Guerreiro bori = new Guerreiro("Bori", 3, 120, 10.0, 6, 5.0);
    	Mago noma = new Mago("Noma", 6, 90, 14.0, 9, 6);
    	
    	//Criando grupos
        Grupo grupoA = new Grupo("Guardiões");
        Grupo grupoB = new Grupo("Titãs");
        grupoA.adicionarMembro(sindri);
        grupoA.adicionarMembro(noma);
        grupoB.adicionarMembro(hildr);
        grupoB.adicionarMembro(bori);
        
        //Listando membros dos grupos
        grupoA.listarMembros();
        grupoB.listarMembros();
        
        grupoA.ordernarMembrosPorNivel();
        grupoB.ordernarMembrosPorNivel();
        
        System.out.println("\n--- Listando grupos após a ordenação por nível ---");
        grupoA.listarMembros();
        grupoB.listarMembros();
        
        //Batalha de grupos
        Arena arenaDaMorte = new Arena("Arena da Morte");
        
        String resultadoDaArena = arenaDaMorte.batalharGrupos(grupoA, grupoB);
        
        System.out.println(resultadoDaArena);
    }
}
