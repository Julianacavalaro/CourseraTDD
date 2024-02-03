
public class Pilha {

	private Object elemento;
	private int quantidade;
	
	public boolean estaVazia() {
		// TODO Auto-generated method stub
		return (elemento == null);
	}

	public int tamanho() {
		// TODO Auto-generated method stub
		return quantidade;
	}

	public void empilha(Object elemento) {
		this.elemento = elemento; // guardando o elemento	
		quantidade++;
	}

	public Object topo() {
		// TODO Auto-generated method stub
		return elemento;
	}

}
