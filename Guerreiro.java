
public class Guerreiro extends Personagem {
	int forca;
	double porcentagemDeRaiva;
	public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, int forca, double porcentagemDeRaiva) {
		super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
		this.forca = forca;
		this.porcentagemDeRaiva = porcentagemDeRaiva;
	}
	
	@Override
	public void exibirStatus() {
		super.exibirStatus();
		System.out.println("Força: " + forca);
		System.out.println("Porcentagem de Raiva: " + porcentagemDeRaiva + "%\n");
	}
	
	@Override
	public void usarHabilidadeEspecial() {
		System.out.println(getClasse() + " " + getNome() + " ataca com Espada Flamejante Raivosa!\n");
	}
}
