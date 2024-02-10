import java.util.HashMap;
import java.util.Map;

public class Tradutor {

		private Map<String,String> traducoes = new HashMap<>();

	public Boolean estaVazio() {
		//return true;
		//return (traducao==null);
		return traducoes.isEmpty();
	}

	 void adicionaTraducao(String palavra, String traducao) {//adiciona uma palavra, retorna a palavra e sua tradução
		if(traducoes.containsKey(palavra)) {
			traducao = traduzir(palavra)+", "+traducao;
		}
		this.traducoes.put(palavra, traducao);
	}

	public String traduzir(String palavra) {
		// TODO Auto-generated method stub
		return traducoes.get(palavra);
	}

	public String traduzirFrase(String frase) {
		String[] palavras = frase.split(" ");//Quebrando a frase em palavras quando separada por " "(espaço em branco)
		String fraseTraduzida = ""; //declação inicial
		for(String palavra : palavras) { //For-each pode ser traduzido como “para cada”. É um laço For que busca uma correspondência pré-determinada para funcionar.
		 /* for (tipo da variável: array) 
		{ 
    		comandos usando a variável;
		}*/
			String traducao = traduzir(palavra);
			fraseTraduzida = fraseTraduzida + " " + traducao;
		}
		return fraseTraduzida.trim(); //.trim() retira o espaço inicial
	}


		
	

}
