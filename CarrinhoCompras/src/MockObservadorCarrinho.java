
//tem que implementar uma interface

import static org.junit.Assert.assertEquals;

import junit.framework.Assert;

public class MockObservadorCarrinho implements ObservadorCarrinho{

	private String nomeRecebido;
	private int valorRecebido;
	
	@Override
	public void produtoAdicionado(String nome, int precoUnitario) {
		nomeRecebido = nome;
		valorRecebido = precoUnitario;
		
	}
	
	public void verificaRecebimentoProduto(String nomeEsperado, int precoUnitarioEsperado) {	
		assertEquals(nomeEsperado, nomeRecebido);
		assertEquals(precoUnitarioEsperado, valorRecebido);
		
	}



}
