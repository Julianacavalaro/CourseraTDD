import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteTradutor {

	@Test
	public void tradutorSemPalavras() {
		//fail("Not yet implemented");
		Tradutor t = new Tradutor(); 
		assertTrue(t.estaVazio());
	}
	@Test
	public void umaTraducao() {
		Tradutor t = new Tradutor();
		t.adicionaTraducao("bom","good");
		assertFalse(t.estaVazio());
		assertEquals("good", t.traduzir("bom")); //Quando traduzir "bom", retornar "good";
	}
	
	@Test
	public void duasTraducoes() {
		Tradutor t = new Tradutor();
		t.adicionaTraducao("bom","good");
		t.adicionaTraducao("ruim","bad");
		assertFalse(t.estaVazio());
		assertEquals("good", t.traduzir("bom")); //Quando traduzir "bom", retornar "good";
		assertEquals("bad", t.traduzir("ruim"));
	}

}
