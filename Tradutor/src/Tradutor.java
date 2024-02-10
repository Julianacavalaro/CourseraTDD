
public class Tradutor {

		private String traducao;

	public Boolean estaVazio() {
		//return true;
		return (traducao==null);
	}

	public void adicionaTraducao(String palavra, String traducao) {//adiciona uma palavra, retorna a palavra e sua tradução
		this.traducao = traducao;
	}

	public Object traduzir(String palavra) {
		// TODO Auto-generated method stub
		return traducao;
	}


		
	

}
