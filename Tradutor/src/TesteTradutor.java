import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteTradutor {
	
	private Tradutor t;

	@BeforeEach //= @Before (jUNIT4)
	public void criarTradutor() {//inicia a classe Tradutor t
		 t = new Tradutor();
	}

	@Test
	public void tradutorSemPalavras() {
		//fail("Not yet implemented");
		//Tradutor t = new Tradutor(); 
		assertTrue(t.estaVazio());
	}
	@Test
	public void umaTraducao() {
		//Tradutor t = new Tradutor();
		t.adicionaTraducao("bom","good");
		assertFalse(t.estaVazio());
		assertEquals("good", t.traduzir("bom")); //Quando traduzir "bom", retornar "good";
	}
	
	@Test
	public void duasTraducoes() {
		//Tradutor t = new Tradutor();
		t.adicionaTraducao("bom","good");
		t.adicionaTraducao("ruim","bad");
		assertFalse(t.estaVazio());
		assertEquals("good", t.traduzir("bom")); //Quando traduzir "bom", retornar "good";
		assertEquals("bad", t.traduzir("ruim"));
	}
	
	@Test
	public void duasTraducoesMesmaPalavra() {
		//Tradutor t = new Tradutor();
		t.adicionaTraducao("bom","good");
		t.adicionaTraducao("bom","nice");
		assertFalse(t.estaVazio());
		assertEquals("good, nice", t.traduzir("bom")); //Quando traduzir "bom", retornar "good";
	}
	
	@Test
	public void traduzirFrase() {
		//Tradutor t = new Tradutor();
		t.adicionaTraducao("guerra", "war");
		t.adicionaTraducao("é", "is");
		t.adicionaTraducao("ruim", "bad");
		assertFalse(t.estaVazio());
		assertEquals("war is bad", t.traduzirFrase("guerra é ruim")); //Quando traduzir "bom", retornar "good";
	}


}
