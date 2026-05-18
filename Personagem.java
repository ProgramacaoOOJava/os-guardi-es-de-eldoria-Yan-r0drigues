public abstract class Personagem implements Comparable<Personagem> {
    private String nome;
	private String classe;
	private int nivel;
	private int pontosDeVida;
	private double poderBase;

	// Construtor da classe, passando os paramêntros exigidos pelos atributos da classe.
	public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
		this.nome = nome;
		this.classe = classe;
		this.nivel = nivel;
		this.pontosDeVida = pontosDeVida;
		this.poderBase = poderBase;
	}
	
	// Método que exibe as informações dos personagens.
	public void exibirStatus() {
		System.out.println("--- Status do Personagem ---");
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Classe: %s\n", classe);
		System.out.printf("Nível: %d\n", nivel);
		System.out.printf("Pontos de Vida: %d\n", pontosDeVida);
		System.out.printf("Poder Base: %.1f\n", poderBase);
	}
	
	public abstract void usarHabilidadeEspecial();
	
	public String getNome() {
		return nome;
	}
	
	public String getClasse() {
		return classe;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public int getPontosDeVida() {
		return pontosDeVida;
	}
	
	public double getPoderBase() {
		return poderBase;
	}
	
	public int compareTo(Personagem outroPersonagem) {
		return Integer.compare(this.getNivel(), outroPersonagem.getNivel());
	}
}

