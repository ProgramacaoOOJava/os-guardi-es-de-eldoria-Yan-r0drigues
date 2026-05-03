public class Main {
    public static void main(String[] args) {
        Personagem primeiroPersonagem = new Personagem("Arthur", "Cavaleiro", 4, 107, 22.4);
		Personagem segundoPersonagem = new Personagem("Shinra", "Mago", 7, 121, 34.5);
		
		primeiroPersonagem.exibirStatus();
		segundoPersonagem.exibirStatus();
    }
}
