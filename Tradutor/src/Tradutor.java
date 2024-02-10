import java.util.HashMap;
import java.util.Map;

public class Tradutor {

		private Map<String,String> traducoes = new HashMap<>();

	public Boolean estaVazio() {
		//return true;
		//return (traducao==null);
		return traducoes.isEmpty();
	}

	public void adicionaTraducao(String palavra,String traducao) {//adiciona uma palavra, retorna a palavra e sua tradução
		this.traducoes.put(palavra, traducao);
	}

	public String traduzir(String palavra) {
		// TODO Auto-generated method stub
		return traducoes.get(palavra);
	}


		
	

}
