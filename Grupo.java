import java.util.*;

public class Grupo {
	private String nomeDoGrupo;
	private List<Personagem> membros;
	private double poderTotalDoGrupo;
	
	public Grupo(String nomeDoGrupo) {
		this.nomeDoGrupo = nomeDoGrupo;
		this.membros = new ArrayList<>();
	}
	
	public double getPoderTotalDoGrupo() {
		return poderTotalDoGrupo;
	}
	
	public double calcularPoderDoGrupo() {
		for(Personagem p : membros) {
			poderTotalDoGrupo += p.getNivel() * p.getPoderBase();
		}
		
		return poderTotalDoGrupo;
	}
	
	public String getNomeDoGrupo() { return nomeDoGrupo; } 
	
	public void adicionarMembro(Personagem personagem) {
		membros.add(personagem);
	}
	
	public void listarMembros() {
		System.out.println("\n--- Membros do Grupo " + nomeDoGrupo + " ---");
		for(Personagem personagem : membros) {
			personagem.exibirStatus();
		}
		System.out.println("-----------------------------------------------");
	}
	
	public void batalhar(Personagem p1, Personagem p2) {
		System.out.println("\n--- INÍCIO DA BATALHA ---");
		
		int poderTotalP1 = (int) (p1.getNivel() * p1.getPoderBase());
		int poderTotalP2 = (int) (p2.getNivel() * p2.getPoderBase());
		
		System.out.println(p1.getNome() + " Poder Total: " + String.format("%.2f", poderTotalP1));
		System.out.println(p2.getNome() + " Poder Total: " + String.format("%.2f", poderTotalP2));
		
		if (poderTotalP1 > poderTotalP2) {
			System.out.println("\n" + p1.getClasse() + " " + p1.getNome() + " venceu! Poder Total: " + poderTotalP1);
		} else if (poderTotalP1 < poderTotalP2) {
			System.out.println("\n" + p2.getClasse() + " " + p2.getNome() + " venceu! Poder Total: " + poderTotalP2);
		} else {
			System.out.println("\n--- EMPATE! ---");
			System.out.println(p1.getClasse() + " " + p1.getNome() + " - Poder Total: " + poderTotalP1);
			System.out.println(p2.getClasse() + " " + p2.getNome() + " - Poder Total: " + poderTotalP2);
		}
		
		System.out.println("--- FIM DA BATALHA ---");
	}
	
	public List<Personagem> getMembros() {
		return membros;
	}
	
	public void ordernarMembrosPorNivel() {
		Collections.sort(membros);
	}
}
