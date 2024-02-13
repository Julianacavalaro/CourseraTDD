import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	
	private List<Produto> itens = new ArrayList<>();

	public void adicionaProduto(Produto produto) {
		itens.add(produto);
		// TODO Auto-generated method stub
		
	}

	public int total() {
		// TODO Auto-generated method stub
		int total =0;
		for(Produto produto : itens) { // percorre a lista de itens que tem dentro de si cada produto
			total = total + produto.getPrecoUnidade();
		}
		return total;
	}

	//Observador carrinho é a abstração
	public void adicionaObservador(ObservadorCarrinho observador) {
		// TODO Auto-generated method stub
		
	}

}
