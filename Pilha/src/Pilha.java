
public class Pilha {

	private Object[] elementos = new Object[10];
	private int quantidade;
	
	public boolean estaVazia() {
		// TODO Auto-generated method stub
		return quantidade == 0;
	}

	public int tamanho() {
		// TODO Auto-generated method stub
		return quantidade;
	}

	public void empilha(Object elemento) {
		this.elementos[quantidade] = elemento; // guardando o elemento	
		quantidade++;
	}

	public Object topo() {
		// TODO Auto-generated method stub
		return elementos[quantidade - 1];
	}

	public Object desempilha() {
		Object topo = topo();
		quantidade--;
		return topo;
	}

}
