public class Arena {
	private String nomeDaArena;
	
	public Arena(String nomeDaArena) {
		this.nomeDaArena = nomeDaArena;
	}
	
	public String getNomeDaArena() {
		return nomeDaArena;
	}
	
	public String batalharGrupos(Grupo g1, Grupo g2) {
		g1.calcularPoderDoGrupo();
		g2.calcularPoderDoGrupo();
		
		if (g1.getPoderTotalDoGrupo() > g2.getPoderTotalDoGrupo()) {
			return "\nGrupo " + g1.getNomeDoGrupo() + " venceu! Poder Total do Grupo: " + g1.getPoderTotalDoGrupo();
		} else if (g1.getPoderTotalDoGrupo() < g2.getPoderTotalDoGrupo()) {
			return "\nGrupo " + g2.getNomeDoGrupo() + " venceu! Poder Total do Grupo: " + g2.getPoderTotalDoGrupo();
		} else {
			return "\nEmpate! Os dois grupos tem os mesmos poderes totais.";
		}
	}
}
