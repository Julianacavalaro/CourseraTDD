/**
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class TesteCarrinhoCompras {

	@Test
	public void totalCarrinho() {
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		carrinhoCompras.adicionaProduto(new Produto("tenis",100));
		carrinhoCompras.adicionaProduto(new Produto("camiseta",50));
		carrinhoCompras.adicionaProduto(new Produto("bermuda",70));
		assertEquals(220, carrinhoCompras.total());
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	//Fazer com que o carrinho esculte um produto
	@Test
	public void escutaAdicaoDeProduto() {
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		//Criar meu mock
		MockObservadorCarrinho mock = new MockObservadorCarrinho();
		carrinhoCompras.adicionaObservador(mock);
		carrinhoCompras.adicionaProduto(new Produto("tenis",100));
		mock.verificaRecebimentoProduto("tenis",100);
	}

}
