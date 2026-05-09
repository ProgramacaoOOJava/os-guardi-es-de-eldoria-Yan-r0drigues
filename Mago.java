
public class Mago extends Personagem {
	int inteligencia;
	int agilidade;
	
	public Mago(String nome, int nivel, int pontosDeVida, double poderBase, int inteligencia, int agilidade) {
		super(nome, "Mago", nivel, pontosDeVida, poderBase);
		this.inteligencia = inteligencia;
		this.agilidade = agilidade;
	}
	
	@Override
	public void exibirStatus() {
		super.exibirStatus();
		System.out.println("Inteligência: " + inteligencia);
		System.out.println("Agilidade: " + agilidade + "\n");
	}
	
	public void usarHabilidadeEspecial() {
		System.out.println(classe + " " + nome + " lança Bola de Fogo Diabólica!\n");
	}
}
